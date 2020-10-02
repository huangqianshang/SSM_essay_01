package com.hqs.controller;

import com.hqs.domain.SysLog;
import com.hqs.service.SysLogService;
import com.hqs.util.GetUUID;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

@Component
@Aspect
public class LogAop {
    private Date date;
    private Class clazz;
    private Method method;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private SysLogService sysLogService;

    @Before("execution(* com.hqs.controller.*.*(..))")
    public void doBefore(JoinPoint jp) throws NoSuchMethodException {
        //获取访问时间
        date = new Date ( );
        //获取方法名
        clazz = jp.getTarget ( ).getClass ( );
//        String methodName = jp.getSignature ( ).getName ( );
        //获取的参数错误导致反射失败
//        Object[] args = jp.getArgs ( );
//        if (args == null || args.length == 0) {
//            method = clazz.getMethod (methodName);
//        } else {
//            Class[] classArg = new Class[args.length];
//            for (int i = 0; i < args.length; i++) {
//                classArg[i] = args[i].getClass ( );
//            }
//            method = clazz.getMethod (methodName,classArg);
//        }
        MethodSignature methodSignature = (MethodSignature) jp.getSignature ();
        method = methodSignature.getMethod ();

    }

    @Test
    private void c() throws NoSuchMethodException {
        clazz = ProductController.class;
        String methodName = "findAll";

        Object[] args = {Model.class};

            Class[] classArg = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                classArg[i] = (Class) args[i];
            }
            method = clazz.getMethod (methodName,classArg);
        System.out.println (method );
    }

    @After("execution(* com.hqs.controller.*.*(..))")
    public void doAfter() {
        //获取访问时长
        Long executionTime = new Date ( ).getTime ( ) - date.getTime ( );
        //获取url
        if (clazz != SysLogController.class) {
            //类名上的RequestMapping
            RequestMapping clazzAnnotation = (RequestMapping) clazz.getAnnotation (RequestMapping.class);
            if (clazzAnnotation != null) {
                //方法上的RequestMapping
                RequestMapping methodAnnotation = method.getAnnotation (RequestMapping.class);
                if (methodAnnotation != null) {
                    //拼接url
                    String url = clazzAnnotation.value ( )[0] + methodAnnotation.value ( )[0];
                    //给SysLog对象的属性赋值
                    SysLog sysLog = new SysLog ( );
                    sysLog.setId (GetUUID.get ( ));
                    sysLog.setVisitTime (date);
                    SecurityContext context = SecurityContextHolder.getContext ( );
                    User user = (User) context.getAuthentication ( ).getPrincipal ( );
                    sysLog.setUsername (user.getUsername ( ));
                    sysLog.setIp (request.getRemoteAddr ( ));
                    sysLog.setUrl (url);
                    sysLog.setExecutionTime (executionTime);
                    sysLog.setMethod (clazz.getName ( ) + method.getName ( ));
                    //写入数据库
                    sysLogService.save (sysLog);
                }
            }
        }

    }

}

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
    public void doBefore(JoinPoint jp) throws NoSuchMethodException{
        //获取访问时间
        date = new Date();
        //获取方法名
        clazz = jp.getTarget ( ).getClass ( );
        MethodSignature methodSignature = (MethodSignature) jp.getSignature ();
        method = methodSignature.getMethod ();

    }

    @After("execution(* com.hqs.controller.*.*(..))")
    public void doAfter(){
        //获取访问时长
        Long executionTime = System.currentTimeMillis() - date.getTime();
        //获取url
        String requestURI = request.getRequestURI();
        String url = requestURI.split("\\?")[0];
        if(!url.contains("/sysLog") && !url.contains("/email") && !url.contains("/find") && !url.contains("/show")  ){
            SysLog sysLog = new SysLog();
            sysLog.setId(GetUUID.get());
            sysLog.setVisitTime(date);
            SecurityContext context = SecurityContextHolder.getContext();
            User user = (User) context.getAuthentication().getPrincipal();
            sysLog.setUsername(user.getUsername());
            sysLog.setIp(request.getRemoteAddr());
            sysLog.setUrl(url);
            sysLog.setExecutionTime(executionTime);
            sysLog.setMethod(clazz.getName() + method.getName());
            //写入数据库
            sysLogService.save(sysLog);
        }

    }

}

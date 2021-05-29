package com.hqs.controller;

import com.hqs.domain.Email;
import com.hqs.domain.UserInfo;
import com.hqs.service.EmailService;
import com.hqs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: hqs
 * @date: 1:32 2021/5/10
 */
@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmailService emailService;

    @RequestMapping("/getUserInfo")
    public Object getUserInfo(){
        User user = (User) SecurityContextHolder.getContext ().getAuthentication ().getPrincipal ();
        String id = userService.findIdByUsername(user.getUsername());
        UserInfo userInfo = userService.findById(id);
        userInfo.setId(id);
        return userInfo;
    }

    @RequestMapping("/getEmail")
    public Object getEmail(String id){
        List<Email> newEmail = emailService.findNewEmail(id);
        return newEmail;
    }

    @RequestMapping("/getEmailNum")
    public Object getEmailNum(String id){
        int newEmailNum = emailService.findNewEmailNum(id);
        return newEmailNum;
    }
}

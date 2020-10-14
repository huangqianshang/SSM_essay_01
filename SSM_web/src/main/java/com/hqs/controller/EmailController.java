package com.hqs.controller;

import com.hqs.domain.Email;
import com.hqs.domain.UserInfo;
import com.hqs.service.EmailService;
import com.hqs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private EmailService emailService;
    @Autowired
    private UserService userService;

    private String getUserName(){
        User user = (User)SecurityContextHolder.getContext ().getAuthentication ().getPrincipal ();
        return user.getUsername ();
    }

    private String getUserId(){
       return userService.findIdByUsername (getUserName ());
    }

    @ResponseBody
    @RequestMapping("/findNewEmailNum")
    public int findNewEmailNum(){
        String userId = getUserId ();
        return emailService.findNewEmailNum (userId);
    }

    @ResponseBody
    @RequestMapping("/findNewEmail")
    public List < Email > findNewEmail(){
        String userId = getUserId ();
        return emailService.findNewEmail(userId);
    }

    @RequestMapping("findAll")
    public String findAll(Model model){
        String userId = getUserId ();
        List<Email> emailList = emailService.findAll(userId);
        model.addAttribute ("emailList",emailList);
        return "email-list";
    }

    @RequestMapping("/linkToSend")
    public String linkToSend(Model model){
        String username = getUserName ();
        List< UserInfo > userList =  userService.findOtherUsernameByUsername(username);
        model.addAttribute ("username",username);
        model.addAttribute ("userList",userList);
        return "email-send";
    }

    @RequestMapping("/sendEmail")
    public void sendEmail(String receiveName,Email email,HttpServletResponse response) throws IOException {
        String receiveId = userService.findIdByUsername(receiveName);
        email.setReceiveId (receiveId);
        email.setSendId (getUserId ());
        emailService.save(email);
        response.sendRedirect ("findAll");
    }

    @RequestMapping("/setRead")
    public void setRead(String emailId, HttpServletResponse response) throws IOException {
        emailService.setRead(emailId);
        response.sendRedirect ("findAll");
    }
}

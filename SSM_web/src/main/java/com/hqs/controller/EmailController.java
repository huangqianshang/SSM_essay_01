package com.hqs.controller;

import com.hqs.domain.Email;
import com.hqs.domain.UserInfo;
import com.hqs.service.EmailService;
import com.hqs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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

    @ResponseBody
    @RequestMapping("/findNewEmailNum")
    public int findNewEmailNum(String userId){
        return emailService.findNewEmailNum (userId);
    }

    @ResponseBody
    @RequestMapping("/findNewEmail")
    public List < Email > findNewEmail(String userId){
        return emailService.findNewEmail(userId);
    }

    @RequestMapping("findAll")
    public String findAll(Model model,String userId){
        List<Email> emailList = emailService.findAll(userId);
        model.addAttribute ("emailList",emailList);
        return "email-list";
    }

    @RequestMapping("/linkToSend")
    public String linkToSend(Model model){
        String username = "admin";
        List< UserInfo > userList =  userService.findOtherUsernameByUsername(username);
        model.addAttribute ("username",username);
        model.addAttribute ("userList",userList);
        return "email-send";
    }

    @RequestMapping("/sendEmail")
    public void sendEmail(String receiveName,Email email){
        String receiveId = userService.findIdByUsername(receiveName);
        email.setReceiveId (receiveId);
        emailService.save(email);
    }

    @RequestMapping("/setRead")
    public void setRead(String id, HttpServletResponse response) throws IOException {
        emailService.setRead(id);
        response.sendRedirect ("findAll?userId=a");
    }
}

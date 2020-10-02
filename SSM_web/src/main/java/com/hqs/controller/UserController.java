package com.hqs.controller;

import com.hqs.domain.Role;
import com.hqs.domain.UserInfo;
import com.hqs.service.RoleService;
import com.hqs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
@Secured ("ROLE_USER")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List < UserInfo > userInfo = userService.findAll ( );
        model.addAttribute ("userList",userInfo);
        return "user-list";
    }

    @RequestMapping("/linkToAdd")
    public String linkToAdd(){
        return "user-add";
    }

    @RequestMapping("/save")
    public void save(HttpServletResponse response,UserInfo user)throws IOException {
        userService.save(user);
        response.sendRedirect ("findAll");
    }

    @RequestMapping("/showMoreById")
    public String showMoreById(Model model,String id){
        UserInfo user = userService.findById(id);
        model.addAttribute ("user",user);
        return "user-show";
    }

    @RequestMapping("/findUserByIdAndAllRole")
    public String findUserByIdAndAllRole(String id,Model model){
        UserInfo user = userService.findById(id);
        user.setId (id);
        List< Role > roleList = roleService.findOtherRole(id);
        model.addAttribute ("user",user);
        model.addAttribute ("roleList",roleList);
        return "user-role-add";
    }

    @RequestMapping("/addRoleToUser")
    public void addRoleToUser(HttpServletResponse response,String ids,String userId) throws IOException {
        userService.addRole(ids,userId);
        response.sendRedirect ("findAll");
    }
}

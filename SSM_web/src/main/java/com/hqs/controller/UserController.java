package com.hqs.controller;

import com.github.pagehelper.PageInfo;
import com.hqs.domain.Role;
import com.hqs.domain.UserInfo;
import com.hqs.service.RoleService;
import com.hqs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String findAll(Model model, @RequestParam (defaultValue = "1") int pageNum,@RequestParam(defaultValue = "4") int pageSize){
        List < UserInfo > userInfo = userService.findAll ( pageNum,pageSize);
        PageInfo<UserInfo> pageInfo = new PageInfo < UserInfo > ();
        pageInfo.setList (userInfo);
        //当前页数
        pageInfo.setPageNum (pageNum);
        //当前每页个数
        pageInfo.setPageSize (pageSize);
        //数据总条数
        int count = userService.findTotalUser();
        pageInfo.setSize (count);
        //总页数
        pageInfo.setPages (count%pageSize==0?count/pageSize:count/pageSize+1);
        model.addAttribute ("pageInfo",pageInfo);
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

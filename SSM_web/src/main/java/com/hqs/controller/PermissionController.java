package com.hqs.controller;

import com.hqs.domain.Permission;
import com.hqs.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/permission")
@Secured("ROLE_USER")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List < Permission > permissionList = permissionService.findAll();
        model.addAttribute ("permissionList",permissionList);
        return "permission-list";
    }

    @RequestMapping("/linkToAdd")
    public String linkToAdd(){
        return "permission-add";
    }

    @RequestMapping("/save")
    public void save(Permission permission, HttpServletResponse response) throws IOException {
        permissionService.save(permission);
        response.sendRedirect ("findAll");
    }
}

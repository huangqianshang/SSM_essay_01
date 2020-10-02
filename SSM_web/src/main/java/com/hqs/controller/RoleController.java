package com.hqs.controller;

import com.hqs.domain.Permission;
import com.hqs.domain.Role;
import com.hqs.service.PermissionService;
import com.hqs.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/role")
@Secured("ROLE_USER")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List < Role > roleList = roleService.findAll();
        model.addAttribute ("roleList",roleList);
        return "role-list";
    }

    @RequestMapping("/linkToAdd")
    public String linkToAdd(){
        return "role-add";
    }

    @RequestMapping("/save")
    public void save(HttpServletResponse response,Role role) throws IOException {
        roleService.save(role);
        response.sendRedirect ("findAll");
    }

    @RequestMapping("/showMoreById")
    public String showMoreById(String id,Model model){
        Role role = roleService.findById (id);
        model.addAttribute ("role",role);
        return "role-show";
    }

    @RequestMapping("/findRoleByIdAndAllPermission")
    public String findRoleByIdAndAllPermission(String id,Model model){
        Role role = roleService.findById(id);
        role.setId (id);
        List< Permission > permissionList = permissionService.findByRoleId (id);
        model.addAttribute ("role",role);
        model.addAttribute ("permissionList",permissionList);
        return "role-permission-add";
    }

    @RequestMapping("/addPermissionToRole")
    public void addPermissionToRole(String roleId,HttpServletResponse response,String ids) throws IOException {
        roleService.addPermissionToRole(roleId,ids);
        response.sendRedirect ("findAll");
    }
}

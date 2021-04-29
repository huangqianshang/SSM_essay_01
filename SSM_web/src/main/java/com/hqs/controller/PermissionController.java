package com.hqs.controller;

import com.github.pagehelper.PageInfo;
import com.hqs.domain.Permission;
import com.hqs.domain.Product;
import com.hqs.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String findAll(Model model, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "4") int pageSize){
        List < Permission > permissionList = permissionService.findAll(pageNum,pageSize);
        PageInfo < Permission > pageInfo = new PageInfo < Permission> ();
        pageInfo.setPageNum (pageNum);
        pageInfo.setPageSize (pageSize);
        int count = permissionService.findTotalPermission();
        pageInfo.setSize (count);
        pageInfo.setList (permissionList);
        pageInfo.setPages (count%pageSize==0?count/pageSize:count/pageSize+1);
        model.addAttribute ("pageInfo",pageInfo);
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

    @ResponseBody
    @RequestMapping("/deleteByIds")
    public int deleteByIds(HttpServletResponse response,String ids) throws IOException {
        return permissionService.deleteByIds(ids);
    }
}

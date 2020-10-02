package com.hqs.controller;

import com.hqs.domain.SysLog;
import com.hqs.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sysLog")
@Secured("ROLE_USER")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List < SysLog > sysLogs =  sysLogService.findAll();
        model.addAttribute ("sysLogs",sysLogs);
        return "syslog-list";
    }
}

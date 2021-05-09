package com.hqs.controller;

import com.github.pagehelper.PageInfo;
import com.hqs.domain.SysLog;
import com.hqs.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/sysLog")
@Secured("ROLE_USER")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/findAll")
    public String findAll(Model model, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize,@RequestParam(defaultValue = "")String keyValue){
        List < SysLog > sysLogs =  sysLogService.findAll(pageNum,pageSize,keyValue);
        PageInfo<SysLog> pageInfo = new PageInfo < SysLog > ();
        pageInfo.setPageNum (pageNum);
        pageInfo.setPageSize (pageSize);
        pageInfo.setList (sysLogs);
        int count = sysLogService.findTotalLog(keyValue);
        pageInfo.setSize (count);
        pageInfo.setPages (count%pageSize==0?count/pageSize:count/pageSize+1);
        model.addAttribute ("pageInfo",pageInfo);
        model.addAttribute("keyValue",keyValue);
        return "syslog-list";
    }
}

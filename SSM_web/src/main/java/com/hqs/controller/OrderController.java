package com.hqs.controller;

import com.github.pagehelper.PageInfo;
import com.hqs.domain.Orders;
import com.hqs.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/findAll")
    public String findAll(Model model, @RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "4") int pageSize){
        List < Orders > orders = orderService.findAll (pageNum,pageSize );
        PageInfo<Orders> pageInfo = new PageInfo < Orders > ();
        pageInfo.setList (orders);
        //当前页数
        pageInfo.setPageNum (pageNum);
        //当前每页个数
        pageInfo.setPageSize (pageSize);
        //数据总条数
        int count = orderService.findDataCount ( );
        pageInfo.setSize (count);
        //总页数
        pageInfo.setPages (count%pageSize==0?count/pageSize:count/pageSize+1);

        model.addAttribute ("pageInfo",pageInfo);
        return "order-list";
    }

    @RequestMapping("/showMoreById")
    public String showMoreById(Model model,String id){
        Orders orders = orderService.findById (id);
        model.addAttribute ("orders",orders);
        return "order-show";
    }
}

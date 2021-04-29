package com.hqs.controller;

import com.github.pagehelper.PageInfo;
import com.hqs.domain.Product;
import com.hqs.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    //查询所有
    @RequestMapping("/findAll")
    public String findAll(Model model, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "4") int pageSize) {
        List < Product > products = productService.findAll (pageNum,pageSize);
        PageInfo < Product > pageInfo = new PageInfo < Product> ();
        pageInfo.setPageSize (pageSize);
        pageInfo.setPageNum (pageNum);
        pageInfo.setList (products);
        int count = productService.findTotalProduct();
        pageInfo.setSize (count);
        pageInfo.setPages (count%pageSize==0?count/pageSize:count/pageSize+1);
        model.addAttribute ("pageInfo",pageInfo);
        return "product-list";
    }

    //跳转到product-add.jsp
    @RequestMapping("/linkToAdd")
    public String linkToAdd(){
        return "product-add";
    }

    //添加
    @RequestMapping("/add")
    public void add(HttpServletResponse response,Product product,String String_DepartureTime,String String_productStatus) throws IOException {
        productService.add (product,String_DepartureTime,String_productStatus);
        response.sendRedirect ("findAll");
    }

    @ResponseBody
    @RequestMapping("/deleteByIds")
    public int deleteByIds(HttpServletResponse response,String ids) throws IOException {
        return productService.deleteByIds(ids);
    }

    @ResponseBody
    @RequestMapping("/updateProductStatus")
    public int updateProductStatus(String ids,int productStatus) throws IOException {
        return productService.updateProductStatus(ids,productStatus);
    }
}

package com.hqs.controller;

import com.hqs.domain.Product;
import com.hqs.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String findAll(Model model) {
        List < Product > products = productService.findAll ( );
        model.addAttribute ("products", products);
        return "product-list";
    }

    //跳转到product-add.jsp
    @RequestMapping("linkToAdd")
    public String linkToAdd(){
        return "product-add";
    }

    //添加
    @RequestMapping("/add")
    public void add(HttpServletResponse response,Product product,String String_DepartureTime,String String_productStatus) throws IOException {
        productService.add (product,String_DepartureTime,String_productStatus);
        response.sendRedirect ("findAll");
    }
}

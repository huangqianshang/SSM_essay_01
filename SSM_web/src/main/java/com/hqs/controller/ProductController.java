package com.hqs.controller;

import com.github.pagehelper.PageInfo;
import com.hqs.domain.Orders;
import com.hqs.domain.Product;
import com.hqs.domain.Route;
import com.hqs.service.OrderService;
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
    @Autowired
    private OrderService orderService;

    //查询所有
    @RequestMapping("/findAll")
    public String findAll(Model model, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "4") int pageSize,@RequestParam(defaultValue = "") String keyValue) {
//        List < Product > products = productService.findAll (pageNum,pageSize,keyValue);
//        PageInfo < Product > pageInfo = new PageInfo < Product> ();
//        pageInfo.setPageSize (pageSize);
//        pageInfo.setPageNum (pageNum);
//        pageInfo.setList (products);
//        int count = productService.findTotalProduct(keyValue);
//        pageInfo.setSize (count);
//        pageInfo.setPages (count%pageSize==0?count/pageSize:count/pageSize+1);
//        model.addAttribute ("pageInfo",pageInfo);
//        model.addAttribute("keyValue",keyValue);
//        return "product-list";
        List <Route> products = productService.findAllRoute (pageNum,pageSize,keyValue);
        PageInfo < Route > pageInfo = new PageInfo < Route> ();
        pageInfo.setPageSize (pageSize);
        pageInfo.setPageNum (pageNum);
        pageInfo.setList (products);
        int count = productService.findTotalRoute(keyValue);
        pageInfo.setSize (count);
        pageInfo.setPages (count%pageSize==0?count/pageSize:count/pageSize+1);
        model.addAttribute ("pageInfo",pageInfo);
        model.addAttribute("keyValue",keyValue);
        return "product-list";
    }

    //跳转到product-add.jsp
    @RequestMapping("/linkToAdd")
    public String linkToAdd(){
        return "product-add";
    }

    //添加
//    @RequestMapping("/add")
//    public void add(HttpServletResponse response,Product product,String String_DepartureTime,String String_productStatus) throws IOException {
//        productService.add (product,String_DepartureTime,String_productStatus);
//        response.sendRedirect ("findAll");
//    }
    @RequestMapping("/add")
    public void add(HttpServletResponse response,Route route,String rdate,String rflag) throws IOException {
        productService.add (route,rdate,rflag);
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

//    @RequestMapping("/show")
//    public String showMoreById(Model model,String id){
//        Product product = productService.findById(id);
//        model.addAttribute ("product",product);
//        model.addAttribute("id",id);
//        return "product-show";
//    }
    @RequestMapping("/show")
    public String showMoreById(Model model,String id){
        Route route = productService.findRouteById(id);
        model.addAttribute ("product",route);
        model.addAttribute("id",id);
        return "product-show";
    }

//    @RequestMapping("/update")
//    public void update(HttpServletResponse response,Product product,String String_DepartureTime,String String_productStatus) throws IOException {
//        productService.update(product,String_DepartureTime,String_productStatus);
//        response.sendRedirect ("findAll");
//    }
    @RequestMapping("/update")
    public void update(HttpServletResponse response,Route route,String rdate,String rflag) throws IOException {
        productService.update (route,rdate,rflag);
        response.sendRedirect ("findAll");
    }

    @RequestMapping("/showOrderByProductId")
    public String showOrderByProductId(Model model, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "4") int pageSize,@RequestParam(defaultValue = "") String keyValue,String id) {
//        List <Orders> orders = orderService.findByProductId (id,pageNum,pageSize,keyValue);
        List <Orders> orders = orderService.findByRouteId (id,pageNum,pageSize,keyValue);
        PageInfo < Orders > pageInfo = new PageInfo < Orders> ();
        pageInfo.setPageSize (pageSize);
        pageInfo.setPageNum (pageNum);
        pageInfo.setList (orders);
        int count = orderService.findTotalByRouteId(id,keyValue);
        pageInfo.setSize (count);
        pageInfo.setPages (count%pageSize==0?count/pageSize:count/pageSize+1);
        model.addAttribute ("pageInfo",pageInfo);
        model.addAttribute("keyValue",keyValue);
        model.addAttribute("id",id);
        return "product-show-order";
    }
}

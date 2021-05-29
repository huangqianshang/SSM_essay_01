package com.hqs.service.imp;

import com.github.pagehelper.PageHelper;
import com.hqs.dao.ProductDao;
import com.hqs.domain.Product;
import com.hqs.domain.Route;
import com.hqs.service.ProductService;
import com.hqs.util.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("productService")
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductDao productDao;

    public List < Product > findAll(int pageNum, int pageSize, String keyValue) {
        PageHelper.startPage (pageNum,pageSize);
        return productDao.findAll ("%"+keyValue+"%" );
    }

//    public void add(Product product,String String_DepartureTime,String String_productStatus) {
//        //分配uuid
//        String id = UUID.randomUUID ().toString ( ).replace ("-", "");
//        product.setId (id);
//        //关闭状态
//        product.setProductStatus (0);
//        //判断是否开启
//        if(String_productStatus.equals ("开启")){
//            product.setProductStatus (1);
//        }
//        //设置时间
//        try {
//            product.setDepartureTime (DateFormat.dateParse (String_DepartureTime));
//        } catch (ParseException e) {
//            e.printStackTrace ( );
//        }
//        productDao.add(product);
//    }

    public void add(Route route, String rdate,String rflag){
        //关闭状态
        route.setRflag("0");
        //判断是否开启
        if( rflag.equals("开启") ){
            route.setRflag("1");
        }
        //设置时间
       route.setRdate(rdate);
        productDao.add(route);
    }

    public int findTotalProduct(String keyValue) {
        return productDao.findTotalProduct("%"+keyValue+"%");
    }

    public int deleteByIds(String ids){
        ids = ids.substring(0,ids.length()-1);
//        return productDao.deleteByIds(ids);
        return productDao.deleteRouteByIds(ids);
    }

    public int updateProductStatus(String ids, int productStatus){
        ids = ids.substring(0,ids.length()-1);
//        return productDao.updateProductStatus(ids,productStatus);
        return productDao.updateRouteStatus(ids,productStatus);
    }

    public Product findById(String id){
        return productDao.findById(id);
    }

//    public void update(Product product, String string_DepartureTime, String string_productStatus){
//        product.setProductStatus (Integer.parseInt(string_productStatus));
//        //设置时间
//        try {
//            product.setDepartureTime (DateFormat.dateParse (string_DepartureTime));
//        } catch (ParseException e) {
//            e.printStackTrace ( );
//        }
//        if( product.getDepartureTime() == null ){
//            productDao.update1(product);
//        }else{
//            productDao.update(product);
//        }
//    }
    public void update(Route route,String rdate,String rflag){
        route.setRdate(rdate);
        route.setRflag(rflag);
        productDao.updateRoute(route);
    }

    public List<Route> findAllRoute(int pageNum, int pageSize, String keyValue){
        PageHelper.startPage (pageNum,pageSize);
        return productDao.findAllRoute("%"+keyValue+"%" );
    }

    public int findTotalRoute(String keyValue){
        return productDao.findTotalRoute("%"+keyValue+"%" );
    }

    public Route findRouteById(String id){
        return productDao.findRouteById(id);
    }
}

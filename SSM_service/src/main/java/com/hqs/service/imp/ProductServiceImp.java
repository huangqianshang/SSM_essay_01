package com.hqs.service.imp;

import com.github.pagehelper.PageHelper;
import com.hqs.dao.ProductDao;
import com.hqs.domain.Product;
import com.hqs.service.ProductService;
import com.hqs.util.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.UUID;

@Service("productService")
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductDao productDao;

    public List < Product > findAll(int pageNum, int pageSize) {
        PageHelper.startPage (pageNum,pageSize);
        return productDao.findAll ( );
    }

    public void add(Product product,String String_DepartureTime,String String_productStatus) {
        //分配uuid
        String id = UUID.randomUUID ().toString ( ).replace ("-", "");
        product.setId (id);
        //判断是否开启
        if(String_productStatus.equals ("开启")){
            product.setProductStatus (1);
        }
        //关闭状态
        product.setProductStatus (0);
        //设置时间
        try {
            product.setDepartureTime (DateFormat.dateParse (String_DepartureTime));
        } catch (ParseException e) {
            e.printStackTrace ( );
        }
        productDao.add(product);
    }

    public int findTotalProduct() {
        return productDao.findTotalProduct();
    }

    public int deleteByIds(String ids){
        ids = ids.substring(0,ids.length()-1);
        return productDao.deleteByIds(ids);
    }

    public int updateProductStatus(String ids, int productStatus){
        ids = ids.substring(0,ids.length()-1);
        return productDao.updateProductStatus(ids,productStatus);
    }
}

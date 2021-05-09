package com.hqs.service;

import com.hqs.domain.Product;

import java.util.List;

public interface ProductService {
    //查询所有
    List < Product > findAll(int pageNum, int pageSize,String keyValue);

    //添加
    void add(Product product,String String_DepartureTime,String String_productStatus);

    //查询总数目
    int findTotalProduct(String keyValue);

    //删除
    int deleteByIds(String ids);

    //更新状态
    int updateProductStatus(String ids, int productStatus);

    Product findById(String id);

    void update(Product product, String string_DepartureTime, String string_productStatus);
}

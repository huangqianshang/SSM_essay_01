package com.hqs.service;

import com.hqs.domain.Product;

import java.util.List;

public interface ProductService {
    //查询所有
    List < Product > findAll();

    //添加
    void add(Product product,String String_DepartureTime,String String_productStatus);
}

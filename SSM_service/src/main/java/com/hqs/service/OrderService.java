package com.hqs.service;

import com.hqs.domain.Orders;

import java.util.List;

public interface OrderService {
    //分页查询所有orders
    List < Orders > findAll(int pageNum,int pageSize);

    //查询数据总条数
    int findDataCount();

    //通过id查询订单详情
    Orders findById(String id);
}

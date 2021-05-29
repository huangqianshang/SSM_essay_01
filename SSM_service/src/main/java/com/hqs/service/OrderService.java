package com.hqs.service;

import com.hqs.domain.Orders;

import java.util.List;

public interface OrderService {
    //分页查询所有orders
    List < Orders > findAll(int pageNum,int pageSize,String keyValue);

    //查询数据总条数
    int findDataCount(String keyValue);

    //通过id查询订单详情
    Orders findById(String id);

    //查询对应产品号的订单
    List<Orders> findByProductId(String id, int pageNum, int pageSize, String keyValue);

    //查询对应产品号的订单总数
    int findTotalByProductId(String id, String keyValue);

    List<Orders> findByRouteId(String id, int pageNum, int pageSize, String keyValue);

    int findTotalByRouteId(String id, String keyValue);

    void setOrderStatus(String id, int status);
}

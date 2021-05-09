package com.hqs.service.imp;

import com.github.pagehelper.PageHelper;
import com.hqs.dao.OrderDao;
import com.hqs.domain.Orders;
import com.hqs.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderDao orderDao;

    public List < Orders > findAll(int pageNum,int pageSize,String keyValue) {
        //完成分页
        PageHelper.startPage ( pageNum, pageSize);
        return orderDao.findAll ("%"+keyValue+"%");
    }

    public int findDataCount(String keyValue) {
        return orderDao.findDataCount ("%"+keyValue+"%");
    }

    public Orders findById(String id) {
        return orderDao.findById(id);
    }
}

package com.hqs.dao;

import com.hqs.domain.Member;
import com.hqs.domain.Orders;
import com.hqs.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrderDao {
    @Select ("select * from orders where orderNum like #{keyValue} or orderTime like #{keyValue}")
    @Results({
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.hqs.dao.ProductDao.findById"))
    })
    List < Orders > findAll(String keyValue);

    @Select ("select count(*) from orders where orderNum like #{keyValue} or orderTime like #{keyValue}")
    int findDataCount(String keyValue);

    @Select ("select * from orders where id = #{id}")
    @Results({
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.hqs.dao.ProductDao.findById")),
            @Result(property = "travellers",column = "id",javaType = List.class,many = @Many(select = "com.hqs.dao.TravellerDao.findById")),
            @Result(property = "member",column = "memberId",javaType = Member.class,one = @One(select = "com.hqs.dao.MemberDao.findById")),
    })
    Orders findById(String id);
}

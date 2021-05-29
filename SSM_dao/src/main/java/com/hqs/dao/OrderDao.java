package com.hqs.dao;

import com.hqs.domain.Member;
import com.hqs.domain.Orders;
import com.hqs.domain.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.security.core.parameters.P;

import java.util.List;

public interface OrderDao {
    @Select ("select * from orders where orderNum like #{keyValue}  and orderStatus=0")
    @Results({
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.hqs.dao.ProductDao.findRouteById"))
    })
    List < Orders > findAll(String keyValue);

    @Select ("select count(*) from orders where orderNum like #{keyValue} and orderStatus=0")
    int findDataCount(String keyValue);

    @Select ("select * from orders where id = #{id}")
    @Results({
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.hqs.dao.ProductDao.findRouteById")),
            @Result(property = "travellers",column = "id",javaType = List.class,many = @Many(select = "com.hqs.dao.TravellerDao.findById")),
            @Result(property = "member",column = "memberId",javaType = Member.class,one = @One(select = "com.hqs.dao.MemberDao.findById")),
    })
    Orders findById(String id);

    @Select ("select * from orders where productId = #{id} and orderTime like #{keyValue}")
    @Results({
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.hqs.dao.ProductDao.findById"))
    })
    List<Orders> findByProductId(@Param("id") String id,@Param("keyValue") String keyValue);

    @Select ("select count(*) from orders where productId = #{id} and orderTime like #{keyValue}")
    int findTotalByProductId(@Param("id") String id,@Param("keyValue") String keyValue);

    @Select ("select * from orders where productId = #{id} and orderTime like #{keyValue}")
    @Results({
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.hqs.dao.ProductDao.findRouteById"))
    })
    List<Orders> findByRouteId(@Param("id") String id,@Param("keyValue") String keyValue);

    @Select ("select count(*) from orders where productId = #{id} and orderTime like #{keyValue}")
    int findTotalByRouteId(@Param("id") String id,@Param("keyValue") String keyValue);

    @Update("update orders set orderStatus = #{status} where id = #{id}")
    void setOrderStatus(@Param("id") String id, @Param("status") int status);
}

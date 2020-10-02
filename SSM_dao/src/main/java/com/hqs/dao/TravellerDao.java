package com.hqs.dao;

import com.hqs.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TravellerDao {
    //通过orders.id查询多个Traveller对象
    @Select ("select * from traveller where id in(select travellerId from order_traveller where `orderId` = #{ordersId})")
    List< Traveller > findById(String ordersId);
}

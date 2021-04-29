package com.hqs.dao;


import com.hqs.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ProductDao {
    //查询所有
    @Select ("select * from product")
    List < Product > findAll();

    //添加
    @Insert ("insert into product values (#{id},#{productNum}," +
            "#{productName},#{cityName}," +
            "#{DepartureTime},#{productPrice}," +
            "#{productDesc},#{productStatus})")
    void add(Product product);

    //通过id查找一个product对象
    @Select ("select * from product where id = #{id}")
    Product findById(String id);

    //查找产品总数目
    @Select ("select count(*) from product")
    int findTotalProduct();

    @Delete("delete from product where id in (#{ids}) ")
    int deleteByIds(String ids);

    @Update("update product set productStatus= #{productStatus} where id in (#{ids})")
    int updateProductStatus(@Param("ids") String ids,@Param("productStatus") int productStatus);
}

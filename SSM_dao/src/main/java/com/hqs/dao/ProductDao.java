package com.hqs.dao;


import com.hqs.domain.Product;
import com.hqs.domain.Route;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ProductDao {
    //查询所有
    @Select ("select * from product where productNum like #{keyValue} or productName like #{keyValue} or cityName like #{keyValue}")
    List < Product > findAll(String keyValue);

    //添加
//    @Insert ("insert into product values (#{id},#{productNum}," +
//            "#{productName},#{cityName}," +
//            "#{DepartureTime},#{productPrice}," +
//            "#{productDesc},#{productStatus})")
//    void add(Product product);
    @Insert ("insert into db1.tab_route values (null,#{rname}," +
            "#{price},#{routeIntroduce}," +
            "#{rflag},#{rdate}," +
            "0,0,5,null,1,null)")
    void add(Route route);

    //通过id查找一个product对象
    @Select ("select * from product where id = #{id}")
    Product findById(String id);

    //查找产品总数目
    @Select ("select count(*) from product where productNum like #{keyValue} or productName like #{keyValue} or cityName like #{keyValue}")
    int findTotalProduct(String keyValue);

    @Delete("delete from product where id in (#{ids}) ")
    int deleteByIds(String ids);

    @Update("update product set productStatus= #{productStatus} where id in (#{ids})")
    int updateProductStatus(@Param("ids") String ids,@Param("productStatus") int productStatus);

    @Update("update product set productNum=#{productNum},productName=#{productName},cityName=#{cityName}" +
            ",DepartureTime=#{DepartureTime},productPrice=#{productPrice},productDesc = #{productDesc}" +
            ",productStatus=#{productStatus} where id = #{id}")
    void update(Product product);

    @Update("update product set productNum=#{productNum},productName=#{productName},cityName=#{cityName}" +
            ",productPrice=#{productPrice},productDesc = #{productDesc}" +
            ",productStatus=#{productStatus} where id = #{id}")
    void update1(Product product);

    @Select("select * from db1.tab_route where rname like #{keyValue} or routeIntroduce like #{keyValue} ")
    List<Route> findAllRoute(String keyValue);

    @Select("select count(*) from db1.tab_route where rname like #{keyValue} or routeIntroduce like #{keyValue} ")
    int findTotalRoute(String keyValue);

    @Update("update db1.tab_route set rflag= #{productStatus} where rid in (#{ids})")
    int updateRouteStatus(@Param("ids") String ids,@Param("productStatus") int productStatus);

    @Delete("delete from db1.tab_route where rid in (#{ids}) ")
    int deleteRouteByIds(String ids);

    @Select("select * from db1.tab_route where rid = #{id}")
    Route findRouteById(String id);

    @Update("update db1.tab_route set rname = #{rname},price = #{price},routeIntroduce = #{routeIntroduce}" +
            " ,rflag = #{rflag},rdate=#{rdate} where rid = #{rid}")
    void updateRoute(Route route);
}

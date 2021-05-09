package com.hqs.dao;

import com.hqs.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    @Select("select * from users where username = #{username}")
    @Results({
            @Result(property = "roles",column = "id",javaType = List.class,many = @Many(select = "com.hqs.dao.RoleDao.findByUserId"))
    })
    UserInfo loadUserByUsername(String username);

    @Select ("select * from users where username like #{keyValue}")
    List< UserInfo> findAll(String keyValue);

    @Insert ("insert into users values (#{id},#{email},#{username},#{password},#{phoneNum},#{status})")
    void save(UserInfo user);

    @Select ("select * from users where id = #{id}")
    @Results({
            @Result(property = "roles",column = "id",javaType = List.class,many = @Many(select = "com.hqs.dao.RoleDao.findByUserId"))
    })
    UserInfo findById(String id);

    @Insert ("insert into users_role values (#{userId},#{roleId})")
    void addRole(@Param ("roleId") String ids,@Param ("userId") String userId);

    @Delete("delete from users_role where userId = #{userId} and roleId = #{roleId}")
    void delRole(@Param ("roleId") String ids,@Param ("userId") String userId);

    @Select ("select username from users where username != #{username}")
    List< UserInfo> findOtherUsernameByUsername(String username);

    @Select ("select id from users where username = #{userName}")
    String findIdByUsername(String userName);

    @Select("select count(*) from users")
    int findTotalUser();

    @Update("update users set email=#{email},username=#{username},password=#{password},phoneNum=#{phoneNum},status=#{status} where id = #{id}")
    void update(UserInfo user);

    @Delete("delete from users where id in (#{ids}) ")
    int deleteByIds(String ids);
}

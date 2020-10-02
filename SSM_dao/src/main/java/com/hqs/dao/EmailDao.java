package com.hqs.dao;

import com.hqs.domain.Email;
import com.hqs.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EmailDao {
    //查找新消息数目
    @Select ("select count(*) from email where receiveId = #{receiveId} and readStatus = 0")
    int findNewEmailNum(String receiveId);

    //查找未读消息
    @Select ("select * from email where receiveId = #{receiveId} and readStatus = 0")
    List< Email> findNewEmail(String receiveId);

    @Select ("select * from email where receiveId = #{receiveId}")
    @Results({
            @Result(property = "user",column = "sendId",javaType = UserInfo.class,one = @One(select = "com.hqs.dao.UserDao.findById"))
    })
    List< Email> findAll(String receiveId);

    @Insert ("insert into email values (#{id}," +
            "#{sendId}," +
            "#{content}," +
            "#{sendTime}," +
            "#{receiveId}," +
            "#{readStatus})")
    void save(Email email);

    @Update ("update email set readStatus = 1 where id = #{id}")
    void setRead(String id);
}

package com.hqs.service;

import com.hqs.domain.Email;

import java.util.List;

public interface EmailService {
    //查询新的消息数目
    int findNewEmailNum(String userId);

    //查询新的消息
    List< Email> findNewEmail(String userId);

    //通过id查询所有邮件
    List< Email> findAll(String userId,int pageNum,int pageSize);

    //发送邮件
    void save(Email email) ;

    //标记已读
    void setRead(String emailId);

    //查询所有邮件的数量
    int findTotalEmail(String userId);

    //邮件详情界面
    Email findById(String id);
}

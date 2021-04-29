package com.hqs.service;

import com.hqs.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    //查询所有用户
    List < UserInfo > findAll(int pageNum, int pageSize,String keyValue);

    //保存新增的用户
    void save(UserInfo user);

    //通过id查找一个用户的所有信息
    UserInfo findById(String id);

    //给用户添加角色
    void addRole(String ids, String userId);

    //查找用户名
    List< UserInfo> findOtherUsernameByUsername(String username);

    //通过用户名查找id
    String findIdByUsername(String receiveName);

    //查找用户总数
    int findTotalUser();

    //修改用户
    void update(UserInfo user);

    //删除用户
    int deleteByIds(String ids);
}

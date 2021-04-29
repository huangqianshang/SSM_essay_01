package com.hqs.service;

import com.hqs.domain.Role;

import java.util.List;

public interface RoleService {
    //分页查询所有
    List< Role> findAll(int pageNum, int pageSize,String keyValue);

    //添加角色
    void save(Role role);

    //通过UserId查询用户没有的权限
    List< Role> findOtherRole(String id);

    //通过roleId查找一个角色和他的资源权限
    Role findById(String id);

    //给角色添加资源权限
    void addPermissionToRole(String roleId, String ids);

    //查询角色总个数
    int findTotalRole();

    //根据id删除角色
    int deleteByIds(String ids);
}

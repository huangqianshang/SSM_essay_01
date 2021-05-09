package com.hqs.service;

import com.hqs.domain.Permission;

import java.util.List;

public interface PermissionService {
    //查询所有资源权限
    List< Permission> findAll(int pageNum, int pageSize,String keyValue);

    //新建资源权限
    void save(Permission permission);

    //通过roleId查找角色所没有的permission
    List< Permission> findByRoleId(String id);

    //通过roleId查找角色拥有的permission
    List< Permission> findMyByRoleId(String id);

    //查询资源权限总个数
    int findTotalPermission(String keyValue);

    //删除资源权限
    int deleteByIds(String ids);
}

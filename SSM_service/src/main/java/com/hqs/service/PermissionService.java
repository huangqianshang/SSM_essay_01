package com.hqs.service;

import com.hqs.domain.Permission;

import java.util.List;

public interface PermissionService {
    //查询所有资源权限
    List< Permission> findAll();

    //新建资源权限
    void save(Permission permission);

    //通过roleId查找角色所没有的permission
    List< Permission> findByRoleId(String id);
}

package com.hqs.domain;

import java.util.List;

public class Role {
    private String id;          //无意义 uuid
    private String roleName;    //角色名
    private String roleDesc;    //角色描述
    private List < Permission > permissions;  //资源权限信息
    private List < UserInfo > users;   //用户信息

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List < Permission > getPermissions() {
        return permissions;
    }

    public void setPermissions(List < Permission > permissions) {
        this.permissions = permissions;
    }

    public List < UserInfo > getUsers() {
        return users;
    }

    public void setUsers(List < UserInfo > users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", permissions=" + permissions +
                ", users=" + users +
                '}';
    }
}

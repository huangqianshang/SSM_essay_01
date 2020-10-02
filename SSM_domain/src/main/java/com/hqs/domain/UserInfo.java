package com.hqs.domain;

import java.util.List;

public class UserInfo {
    private String id;          //无意义,主键，uuid
    private String username;    //用户名
    private String email;       //非空，唯一
    private String password;    //密码（加密）
    private String phoneNum;    //电话
    private int status;         //状态0 未开启 1 开启
    private List < Role > roles; //角色信息

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getStatus() {
        return status;
    }

    public String getStringStatus() {
        //状态0 未开启 1 开启
        if (status == 0)
            return "未开启";
        return "开启";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List < Role > getRoles() {
        return roles;
    }

    public void setRoles(List < Role > roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", status=" + status +
                ", roles=" + roles +
                '}';
    }
}

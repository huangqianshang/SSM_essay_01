package com.hqs.domain;

public class Member {
    private String id;          //无意义、主键uuid
    private String name;        //姓名
    private String username;    //昵称
    private String telephone;    //电话号码
    private String email;       //邮箱

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String nickname) {
        this.username = nickname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String phoneNum) {
        this.telephone = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + username + '\'' +
                ", phoneNum='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package com.hqs.domain;

public class Traveller {
    private String id;                      //无意义，uuid
    private String name;                    //姓名
    private String sex;                     //性别
    private String phoneNum;                //电话号码
    private Integer credentialsType;        //证件类型 0身份证 1护照 2军官证
    private String credentialsNum;          //证件号码
    private Integer travellerType;          //旅客类型(人群) 0 成人 1 儿童

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getCredentialsType() {
        return credentialsType;
    }

    public String getStringCredentialsType(){
        //证件类型 0身份证 1护照 2军官证
        switch (credentialsType){
            case 0:
                return "身份证";
            case 1:
                return "护照";
            case 2:
                return "军官证";
            default:
                return "未知证件";
        }
    }
    public void setCredentialsType(Integer credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum;
    }

    public Integer getTravellerType() {
        return travellerType;
    }

    public String getStringTravellerType() {
        //旅客类型(人群) 0 成人 1 儿童
        if (travellerType == 0)
            return "成人";
        return "儿童";
    }

    public void setTravellerType(Integer travellerType) {
        this.travellerType = travellerType;
    }

    @Override
    public String toString() {
        return "Traveller{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", credentialsType=" + credentialsType +
                ", credentialsNum='" + credentialsNum + '\'' +
                ", travellerType=" + travellerType +
                '}';
    }
}

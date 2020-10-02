package com.hqs.domain;

import com.hqs.util.DateFormat;

import java.util.Date;
import java.util.List;

public class Orders {
    private String id;          //无意义，uuid
    private String orderNum;    //订单编号
    private Date orderTime;     //下单时间
    private int peopleCount;    //出行人数
    private Product product;    //产品信息
    private List < Traveller > travellers;    //出行人信息
    private Member member;      //用户信息
    private int orderStatus;    //订单状态(0 未支付 1 已支付)
    private Integer payType;    //支付方式(0 支付宝 1 微信 2其它)
    private String orderDesc;   //订单描述

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public String getFormatOrderTime() {
        return DateFormat.dateFormat (orderTime);
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List < Traveller > getTravellers() {
        return travellers;
    }

    public void setTravellers(List < Traveller > travellers) {
        this.travellers = travellers;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public String getStringOrderStatus() {
        //订单状态(0 未支付 1 已支付)
        if (orderStatus == 1){
            return "已支付";
        }
        return "未支付";
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayType() {
        return payType;
    }

    public String getStringPayType(){
        //支付方式(0 支付宝 1 微信 2其它)
        switch (payType) {
            case 0:
                return "支付宝";
            case 1:
                return "微信";
            case 2:
                return "其他";
            default:
                return "未知方式";
        }
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", orderTime=" + orderTime +
                ", peopleCount=" + peopleCount +
                ", product=" + product +
                ", travellers=" + travellers +
                ", member=" + member +
                ", orderStatus=" + orderStatus +
                ", payType=" + payType +
                ", orderDesc='" + orderDesc + '\'' +
                '}';
    }
}

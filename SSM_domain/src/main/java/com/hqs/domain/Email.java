package com.hqs.domain;

import com.hqs.util.DateFormat;

import java.util.Date;

public class Email {
    private String id;              //uuid  无意义
    private String sendId;          //发送者的id
    private String title;           //标题
    private String content;         //内容
    private Date sendTime;          //发送的时间
    private String receiveId;       //接收者id
    private int readStatus;         //是否已读  0 未读    1 已读
    private UserInfo user;          //发送者信息

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public String getFormatTime(){
        return DateFormat.dateFormat (sendTime);
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public int getReadStatus() {
        return readStatus;
    }

    public String getStringReadStatus(){
        if (readStatus == 0){
            return "未读";
        }
        return "已读";
    }
    public void setReadStatus(int readStatus) {
        this.readStatus = readStatus;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }
}

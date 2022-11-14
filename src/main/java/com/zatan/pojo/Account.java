package com.zatan.pojo;

import java.util.Date;

public class Account {

    private int id;
    private String accountNum;
    private String userIp;
    private String status;
    private int vip;
    private int totalLikeNum;
    private int isFollowed;
    private String attentionUser;
    private Date creatTime;
    private String headerUrl;
    private String motto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public int getTotalLikeNum() {
        return totalLikeNum;
    }

    public void setTotalLikeNum(int totalLikeNum) {
        this.totalLikeNum = totalLikeNum;
    }

    public int getIsFollowed() {
        return isFollowed;
    }

    public void setIsFollowed(int isFollowed) {
        this.isFollowed = isFollowed;
    }

    public String getAttentionUser() {
        return attentionUser;
    }

    public void setAttentionUser(String attentionUser) {
        this.attentionUser = attentionUser;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNum='" + accountNum + '\'' +
                ", userIp='" + userIp + '\'' +
                ", status='" + status + '\'' +
                ", vip=" + vip +
                ", totalLikeNum=" + totalLikeNum +
                ", isFollowed=" + isFollowed +
                ", attentionUser='" + attentionUser + '\'' +
                ", creatTime=" + creatTime +
                ", headerUrl='" + headerUrl + '\'' +
                ", motto='" + motto + '\'' +
                '}';
    }
}

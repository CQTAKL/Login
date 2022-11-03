package com.zatan.pojo;


import com.zatan.util.GenericUniqueString;

import java.util.Date;
import java.util.List;

public class User {

    private int id;
    private String realName;
    private String nickName;
    private String password;
    private String salt;
    private String phoneName;
    private String email;
    private String userIp;
    private String identifyCode;
    private StatusEnum status;
    private String qq;
    private boolean vip;
    private int totalLikeNum;
    private boolean isFollowed;//是否被关注
    private List<User> attentionUser;//关注的人
    private Date creatTime;
    private String headerUrl;
    private String major;
    private int gender;//1男，0女
    private Date birth;
    private String school;
    private String motto;
    private String accountNum;//账号(随机唯一字符串)

    public User() {
    }

    public User(int id, String realName, String nickName, String password, String salt, String phoneName, String email, String userIp, String identifyCode, StatusEnum status, String qq, boolean vip, int totalLikeNum, boolean isFollowed, List<User> attentionUser, Date creatTime, String headerUrl, String major, int gender, Date birth, String school, String motto, String accountNum) {
        this.id = id;
        this.realName = realName;
        this.nickName = nickName;
        this.password = password;
        this.salt = salt;
        this.phoneName = phoneName;
        this.email = email;
        this.userIp = userIp;
        this.identifyCode = identifyCode;
        this.status = status;
        this.qq = qq;
        this.vip = vip;
        this.totalLikeNum = totalLikeNum;
        this.isFollowed = isFollowed;
        this.attentionUser = attentionUser;
        this.creatTime = creatTime;
        this.headerUrl = headerUrl;
        this.major = major;
        this.gender = gender;
        this.birth = birth;
        this.school = school;
        this.motto = motto;
        this.accountNum = accountNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getTotalLikeNum() {
        return totalLikeNum;
    }

    public void setTotalLikeNum(int totalLikeNum) {
        this.totalLikeNum = totalLikeNum;
    }

    public boolean isFollowed() {
        return isFollowed;
    }

    public void setFollowed(boolean followed) {
        isFollowed = followed;
    }

    public List<User> getAttentionUser() {
        return attentionUser;
    }

    public void setAttentionUser(List<User> attentionUser) {
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = GenericUniqueString.genericString();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", email='" + email + '\'' +
                ", userIp='" + userIp + '\'' +
                ", identifyCode='" + identifyCode + '\'' +
                ", status=" + status +
                ", qq='" + qq + '\'' +
                ", vip=" + vip +
                ", totalLikeNum=" + totalLikeNum +
                ", isFollowed=" + isFollowed +
                ", attentionUser=" + attentionUser +
                ", creatTime=" + creatTime +
                ", headerUrl='" + headerUrl + '\'' +
                ", major='" + major + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                ", school='" + school + '\'' +
                ", motto='" + motto + '\'' +
                ", accountNum='" + accountNum + '\'' +
                '}';
    }
}

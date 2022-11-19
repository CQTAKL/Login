package com.cqtalk.entity;


import com.cqtalk.util.GenericUniqueString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel("用户实体类")
public class User {

    @ApiModelProperty("id")
    private int id;
    @ApiModelProperty("真实姓名")
    private String realName;
    @ApiModelProperty("用户名")
    private String nickName;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("盐")
    private String salt;
    @ApiModelProperty("电话号码")
    private String phoneNum;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("用户ip地址")
    private String userIp;
    @ApiModelProperty("身份证号")
    private String identifyCode;
    @ApiModelProperty("状态")
    private StatusEnum status;
    @ApiModelProperty("qq号")
    private String qq;
    @ApiModelProperty("是不是vip")
    private boolean vip;
    @ApiModelProperty("总共有的赞数")
    private int totalLikeNum;
    @ApiModelProperty("是否被关注")
    private boolean followed;//是否被关注
    @ApiModelProperty("关注的人")
    private List<User> attentionUser;//关注的人
    @ApiModelProperty("用户账号创建时间")
    private Date creatTime;
    @ApiModelProperty("用户头像url")
    private String headerUrl;
    @ApiModelProperty("用户专业")
    private String major;
    @ApiModelProperty("性别")
    private int gender;//1男，0女
    @ApiModelProperty("用户生日")
    private Date birth;
    @ApiModelProperty("用户所在学校")
    private String school;
    @ApiModelProperty("个性签名")
    private String motto;//个性签名
    @ApiModelProperty("账号")
    private String accountNum;//账号(随机唯一字符串)

    public User() {
    }

    public User(int id, String realName, String nickName, String password, String salt, String phoneNum, String email, String userIp, String identifyCode, StatusEnum status, String qq, boolean vip, int totalLikeNum, boolean followed, List<User> attentionUser, Date creatTime, String headerUrl, String major, int gender, Date birth, String school, String motto, String accountNum) {
        this.id = id;
        this.realName = realName;
        this.nickName = nickName;
        this.password = password;
        this.salt = salt;
        this.phoneNum = phoneNum;
        this.email = email;
        this.userIp = userIp;
        this.identifyCode = identifyCode;
        this.status = status;
        this.qq = qq;
        this.vip = vip;
        this.totalLikeNum = totalLikeNum;
        this.followed = followed;
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
        return phoneNum;
    }

    public void setPhoneName(String phoneName) {
        this.phoneNum = phoneName;
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
        return followed;
    }

    public void setFollowed(boolean followed) {
        followed = followed;
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
                ", phoneName='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", userIp='" + userIp + '\'' +
                ", identifyCode='" + identifyCode + '\'' +
                ", status=" + status +
                ", qq='" + qq + '\'' +
                ", vip=" + vip +
                ", totalLikeNum=" + totalLikeNum +
                ", isFollowed=" + followed +
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

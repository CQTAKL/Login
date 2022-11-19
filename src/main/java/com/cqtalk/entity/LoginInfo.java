package com.cqtalk.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("登录信息类")
public class LoginInfo {

    @ApiModelProperty("id")
    private int id;
    @ApiModelProperty("用户名")
    private String nickName;
    @ApiModelProperty("用户密码")
    private String password;
    @ApiModelProperty("盐")
    private String salt;
    @ApiModelProperty("电话号码")
    private String phoneNum;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("qq号")
    private String qq;
    @ApiModelProperty("账号")
    private String accountNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", accountNum='" + accountNum + '\'' +
                '}';
    }
}

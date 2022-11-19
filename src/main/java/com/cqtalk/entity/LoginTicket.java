package com.cqtalk.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("登录凭证类")
public class LoginTicket {

    @ApiModelProperty("用户账号")
    private String account; //用户账号
    @ApiModelProperty("凭证")
    private String ticket;
    @ApiModelProperty("过期时间")
    private Date expired;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    @Override
    public String toString() {
        return "LoginTicket{" +
                "account=" + account +
                ", ticket='" + ticket + '\'' +
                ", expired=" + expired +
                '}';
    }
}

package com.cqtalk.dao;

import com.cqtalk.entity.LoginInfo;
import org.springframework.stereotype.Component;
@Component//未导包，免报错
public interface LoginInfoMapper {
    LoginInfo selectByPhoneNum(String phoneNum);
}

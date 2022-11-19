package com.cqtalk.dao;

import com.cqtalk.entity.User;
import org.springframework.stereotype.Component;

@Component//未导入包，免报错
public interface UserMapper {
    User selectByAccountNum(String accountNum);
}

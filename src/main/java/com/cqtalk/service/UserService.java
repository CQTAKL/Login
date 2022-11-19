package com.cqtalk.service;

import com.cqtalk.dao.LoginInfoMapper;
import com.cqtalk.dao.UserMapper;
import com.cqtalk.entity.LoginInfo;
import com.cqtalk.entity.LoginTicket;
import com.cqtalk.entity.User;
import com.cqtalk.util.ProjectUtil;
import com.cqtalk.util.RedisKeyUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class UserService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LoginInfoMapper loginInfoMapper;

    public Map<String, Object> login(String phoneNum, String password, int expiredSeconds) {
        Map<String, Object> map = new HashMap<>();

        // 空值处理
        if (StringUtils.isBlank(phoneNum)) {
            map.put("usernameMsg", "账号不能为空!");
            return map;
        }
        if (StringUtils.isBlank(password)) {
            map.put("passwordMsg", "密码不能为空!");
            return map;
        }

        // 验证账号

        LoginInfo loginInfo = loginInfoMapper.selectByPhoneNum(phoneNum);
        User user = userMapper.selectByAccountNum(loginInfo.getAccountNum());


        // 生成登录凭证
        LoginTicket loginTicket = new LoginTicket();
        loginTicket.setAccount(user.getAccountNum());
        loginTicket.setTicket(ProjectUtil.generateUUID());
        loginTicket.setExpired(new Date(System.currentTimeMillis() + expiredSeconds * 1000));

        String redisKey = RedisKeyUtil.getTicketKey(loginTicket.getTicket());
        redisTemplate.opsForValue().set(redisKey, loginTicket);

        map.put("ticket", loginTicket.getTicket());
        return map;
    }

    public LoginTicket findLoginTicket(String ticket) {
        String redisKey = RedisKeyUtil.getTicketKey(ticket);
        return (LoginTicket) redisTemplate.opsForValue().get(redisKey);
    }

    public User findUserByAccount(String accountNum) {

        User user = getCache(accountNum);
        if (user == null) {
            user = initCache(accountNum);
        }
        return user;
    }

    // 1.优先从缓存中取值
    private User getCache(String accountNum) {
        String redisKey = RedisKeyUtil.getUserKey(accountNum);
        return (User) redisTemplate.opsForValue().get(redisKey);
    }

    // 2.取不到时初始化缓存数据
    private User initCache(String accountNum) {
        User user = userMapper.selectByAccountNum(accountNum);
        String redisKey = RedisKeyUtil.getUserKey(accountNum);
        redisTemplate.opsForValue().set(redisKey, user, 3600, TimeUnit.SECONDS);
        return user;
    }

    // 3.数据变更时清除缓存数据
    private void clearCache(String accountNum) {
        String redisKey = RedisKeyUtil.getUserKey(accountNum);
        redisTemplate.delete(redisKey);
    }
}

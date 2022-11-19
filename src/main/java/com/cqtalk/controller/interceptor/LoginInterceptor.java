package com.cqtalk.controller.interceptor;

import com.cqtalk.entity.LoginTicket;
import com.cqtalk.entity.User;
import com.cqtalk.service.UserService;
import com.cqtalk.util.CookieUtil;
import com.cqtalk.util.HostHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private UserService userService;
    @Autowired
    private HostHolder hostHolder;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String ticket = CookieUtil.getValue(request,"ticket");
        if(ticket != null){

            LoginTicket loginTicket = userService.findLoginTicket(ticket);
            if (loginTicket != null && loginTicket.getExpired().after(new Date())) {
                // 根据凭证查询账号信息
                User user = userService.findUserByAccount(loginTicket.getAccount());
                // 在本次请求中持有此账号信息
                hostHolder.setAccount(user);
            }
        }
        return true;
    }
}

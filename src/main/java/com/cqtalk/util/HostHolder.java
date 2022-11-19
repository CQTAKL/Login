package com.cqtalk.util;

import com.cqtalk.entity.User;
import org.springframework.stereotype.Component;

@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setAccount(User account) {
        users.set(account);
    }

    public User getAccount() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }

}
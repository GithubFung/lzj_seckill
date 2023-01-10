package com.lzj_seckill.config;

import com.lzj_seckill.pojo.User;

/**
 * Created by 小冯 on 2023/1/10 20:25
 */
public class UserContext {
    private static ThreadLocal<User> userHolder = new ThreadLocal<User>();

    public static User getUser() {
        return userHolder.get();
    }

    public static void setUser(User user) {
        userHolder.set(user);
    }
}

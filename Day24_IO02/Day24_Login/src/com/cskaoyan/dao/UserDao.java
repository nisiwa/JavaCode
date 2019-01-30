package com.cskaoyan.dao;

import com.cskaoyan.pojo.User;

public interface UserDao {
    boolean register(User user);
    boolean login(String name, String password);
}

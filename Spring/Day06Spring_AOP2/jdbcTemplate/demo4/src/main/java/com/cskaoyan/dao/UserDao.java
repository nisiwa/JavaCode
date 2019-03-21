package com.cskaoyan.dao;

import com.cskaoyan.bean.User;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 16:25
 */
public interface UserDao {

	public User queryUserById(String id);
}

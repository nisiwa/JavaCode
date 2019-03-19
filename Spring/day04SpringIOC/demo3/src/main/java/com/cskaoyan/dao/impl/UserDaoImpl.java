package com.cskaoyan.dao.impl;

import com.cskaoyan.bean.User;
import com.cskaoyan.dao.UserDao;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 11:17
 */
public class UserDaoImpl implements UserDao {
	@Override
	public boolean addUser(User user) {
		if (user != null && "zhangsan".equals(user.getUsername()))
		{
			return true;
		}
		return false;
	}
}

package com.cskaoyan.service.impl;

import com.cskaoyan.bean.User;
import com.cskaoyan.dao.UserDao;
import com.cskaoyan.dao.impl.UserDaoImpl;
import com.cskaoyan.service.UserService;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 10:22
 */
public class UserServiceImpl implements UserService {

	UserDao userDao;

	public void setUserDaoz(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean addUser(User user) {
		return userDao.addUser(user);
	}
}

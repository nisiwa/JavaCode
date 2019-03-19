package com.cskaoyan.service.impl;

import com.cskaoyan.dao.UserDao;
import com.cskaoyan.dao.impl.UserDaoImpl;
import com.cskaoyan.service.UserService;

/**
 * Created by little Stone
 * Date 2019/3/18 Time 16:35
 */
public class UserServiceImpl implements UserService {

	UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean addUser() {
		return userDao.addUser();
	}
}

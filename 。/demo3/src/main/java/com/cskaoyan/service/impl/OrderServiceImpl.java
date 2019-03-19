package com.cskaoyan.service.impl;

import com.cskaoyan.dao.OrderDao;
import com.cskaoyan.dao.UserDao;
import com.cskaoyan.dao.impl.OrderDaoImpl;
import com.cskaoyan.dao.impl.UserDaoImpl;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 11:45
 */
public class OrderServiceImpl {
	OrderDao orderDao = new OrderDaoImpl();
	UserDao userDao = new UserDaoImpl();
}

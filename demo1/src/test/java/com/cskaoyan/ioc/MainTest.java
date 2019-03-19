package com.cskaoyan.ioc;

import com.cskaoyan.dao.impl.UserDaoImpl;
import com.cskaoyan.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * Created by little Stone
 * Date 2019/3/18 Time 16:38
 */
public class MainTest {

	@Test
	public void myTest(){

		UserServiceImpl userService;

		UserDaoImpl userDao;
		//userService.setUserDao(userDao);

		//boolean b = userService.addUser();
	}
}

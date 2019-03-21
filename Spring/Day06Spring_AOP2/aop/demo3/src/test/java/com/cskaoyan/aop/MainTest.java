package com.cskaoyan.aop;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import com.cskaoyan.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by little Stone
 * Date 2019/3/20 Time 11:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class MainTest {
	@Autowired
	UserService userService;

	@Test
	public void myTest(){
		userService.addUser(new User());
	}
	@Test
	public void myTest2(){
		UserService userService2 = new UserServiceImpl();
		userService2.addUser(new User());
	}
}

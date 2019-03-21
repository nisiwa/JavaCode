package com.cskaoyan.aop;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 9:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class MainTest3 {
	@Autowired
	@Qualifier("abc")
	UserService userService;
	@Autowired
	@Qualifier("myUserService")
	UserService userService2;
	@Test
	public void myTest(){
		userService.addUser(1,new User());
	}
	@Test
	public void myTest2(){
		userService2.addUser(1,new User());
	}
}

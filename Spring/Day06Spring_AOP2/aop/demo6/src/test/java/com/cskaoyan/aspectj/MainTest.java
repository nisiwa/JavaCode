package com.cskaoyan.aspectj;

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
 * Date 2019/3/21 Time 14:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class MainTest {
	@Autowired
	@Qualifier("myUserService")
	UserService userService;

	@Test
	public void myTest(){
		userService.addUser(1,new User());
	}
}

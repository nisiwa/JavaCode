package com.cskaoyan.destroy;

import com.cskaoyan.bean.User;
import com.cskaoyan.config.SpringConfig;
import com.cskaoyan.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 15:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class MainTest {
	@Autowired
	User user;
	@Autowired
	@Qualifier("userServiceFromFactory")
	UserService userService;
	@Test
	public void myTest(){
		System.out.println(user);
	}
	@Test
	public void myTest2(){
		userService.addUser(new User());
	}
}

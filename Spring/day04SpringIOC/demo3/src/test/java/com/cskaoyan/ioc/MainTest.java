package com.cskaoyan.ioc;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 11:30
 */
public class MainTest {
	ApplicationContext applicationContext;
	@Before
	public void init(){
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test1(){
		UserService userService = (UserService) applicationContext.getBean("userService");
		User user = new User();
		user.setUsername("zhangsan");
		boolean b = userService.addUser(user);
		System.out.println(b);
	}
	@Test
	public void myTest2(){
		User me = (User) applicationContext.getBean("me");
		System.out.println(me);
	}
}

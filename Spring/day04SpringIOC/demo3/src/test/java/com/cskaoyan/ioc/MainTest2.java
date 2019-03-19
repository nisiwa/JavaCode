package com.cskaoyan.ioc;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 11:49
 */
public class MainTest2 {
	ApplicationContext applicationContext;
	@Before
	public void init(){
		applicationContext =
				new FileSystemXmlApplicationContext("E:\\j12_workspace\\ioc\\demo3\\src\\main\\resources\\applicationContext.xml");
	}

	@Test
	public void test1(){
		UserService userService = (UserService) applicationContext.getBean("userService");
		User user = new User();
		user.setUsername("zhangsan");
		boolean b = userService.addUser(user);
		System.out.println(b);
	}
}

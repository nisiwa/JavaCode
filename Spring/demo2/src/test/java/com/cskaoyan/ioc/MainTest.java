package com.cskaoyan.ioc;

import com.cskaoyan.User;
import com.cskaoyan.service.UserService;
import com.cskaoyan.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 10:23
 */
public class MainTest {
	@Test
	public void myTest1(){
		/*正向的过程*/
		UserService userService = new UserServiceImpl();
		userService.addUser();
	}
	ApplicationContext applicationContext;
	@Before
	public void init(){
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void myTest2(){
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*控制反转的过程*/
		/*这个就是注入的过程*/
		UserService userService = (UserService) applicationContext.getBean("zzz");
		System.out.println(userService.getClass().getName());
		userService.addUser();
	}
	@Test
	public void myTest3(){
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*控制反转的过程*/
		/*这个就是注入的过程*/
		UserService userService = (UserService) applicationContext.getBean(UserServiceImpl.class);
		userService.addUser();
	}
	@Test
	public void myTest4(){
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*控制反转的过程*/
		/*这个就是注入的过程*/
		UserServiceImpl zzz = applicationContext.getBean("zzz", UserServiceImpl.class);
		zzz.addUser();
	}
	@Test
	public void myTest5(){
		User bean = applicationContext.getBean(User.class);
		System.out.println("user:" + bean);
	}

}

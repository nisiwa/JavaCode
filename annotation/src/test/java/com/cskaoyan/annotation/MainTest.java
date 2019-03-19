package com.cskaoyan.annotation;

import com.cskaoyan.bean.Classroom;
import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import com.cskaoyan.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 17:25
 */
public class MainTest {
	ClassPathXmlApplicationContext applicationContext;
	@Before
	public void init(){
		applicationContext = new ClassPathXmlApplicationContext("application.xml");
	}
	@Test
	public void myTest(){
		User bean = applicationContext.getBean(User.class);
		System.out.println(bean);
	}
	@Test
	public void myTest2(){
		User bean = (User) applicationContext.getBean("suiyi");
		System.out.println(bean);
	}
	@Test
	public void myTest3(){
		UserService bean = applicationContext.getBean(UserServiceImpl.class);
		System.out.println(bean);
	}
	@Test
	public void myTest4(){
		Classroom bean = applicationContext.getBean(Classroom.class);
		System.out.println(bean);
		applicationContext.close();
	}
	@Test
	public void myTest5(){
		Object classroom = applicationContext.getBean("classroom");
		Object classroom2 = applicationContext.getBean("classroom");
		System.out.println(classroom == classroom2);
	}
}

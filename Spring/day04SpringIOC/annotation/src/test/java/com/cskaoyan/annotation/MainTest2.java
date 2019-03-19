package com.cskaoyan.annotation;

import com.cskaoyan.bean.Classroom;
import com.cskaoyan.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 17:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class MainTest2 {
	@Autowired
	User user;
	@Autowired
	Classroom classroom;
	//@Autowired
	//ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("application2.xml");
	@Test
	public void myTest1(){
		//applicationContext.getBean()
		//User suiyi = (User) applicationContext2.getBean("suiyi");
		//System.out.println(suiyi);
	}
}

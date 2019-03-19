package com.skaoyan.property;

import com.cskaoyan.bean.CollectionData;
import com.cskaoyan.bean.Person;
import com.cskaoyan.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 16:41
 */
public class MainTest {
	@Test
	public void myTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(user);
		System.out.println(person);
	}
	@Test
	public void myTest2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionData collectData = (CollectionData) applicationContext.getBean("collectData");
		System.out.println(collectData);
	}
}

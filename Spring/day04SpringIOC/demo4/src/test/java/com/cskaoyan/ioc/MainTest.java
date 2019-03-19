package com.cskaoyan.ioc;

import com.cskaoyan.bean.Dog;
import com.cskaoyan.bean.Person;
import com.cskaoyan.bean.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 14:40
 */
public class MainTest {
	ApplicationContext applicationContext;
	@Before
	public void initdfsakljf(){
		applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void myTest(){
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User bean = (User) applicationContext.getBean("com.cskaoyan.bean.User");
		System.out.println(bean);
	}
	@Test
	public void myTest2(){
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
		Dog dog = (Dog) applicationContext.getBean("dog");
		System.out.println(dog);
	}
}

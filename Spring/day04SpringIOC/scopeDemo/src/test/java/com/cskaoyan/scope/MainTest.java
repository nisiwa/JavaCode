package com.cskaoyan.scope;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 15:55
 */
public class MainTest {

	ClassPathXmlApplicationContext applicationContext;
	@Before
	public void initzzz(){
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void myTest(){
		Object sinletonPerson = applicationContext.getBean("sinletonPerson");
		Object sinletonPerson2 = applicationContext.getBean("sinletonPerson");
		System.out.println(sinletonPerson == sinletonPerson2);
	}
	@Test
	public void myTest2(){
		Object animal = applicationContext.getBean("animal");
		Object animal2 = applicationContext.getBean("animal");
		System.out.println(animal == animal2);
	}
	@Test
	public void myTest3(){
		Object dog = applicationContext.getBean("dog");
		Object dog2 = applicationContext.getBean("dog");
		System.out.println(dog == dog2);
		//Assert.assertEquals(dog,dog2);
	}
	@Test
	public void myTest4(){
		//System.out.println("444");
		Object menzz = applicationContext.getBean("menzz");
		applicationContext.close();
	}
}

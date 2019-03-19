package com.cskaoyan.factory;

import com.cskaoyan.util.HelloUtil;
import com.cskaoyan.util.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 15:07
 */
public class MainTest {
	ApplicationContext applicationContext;
	@Before
	public void initdfsakljf(){
		applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	/*静态工厂*/
	@Test
	public void myTest1(){
		Object animalFromFactory = applicationContext.getBean("animalFromFactory");
		System.out.println(animalFromFactory.getClass().getName());
	}
	@Test
	public void myTest2(){
		String hello = StringUtil.add("hello", " world");
		System.out.println(hello);
	}
	@Test
	public void myTest3(){
		HelloUtil helloUtil = new HelloUtil();
		String hello = helloUtil.add("hello", " world");
		System.out.println(hello);

	}
	/*实例工厂*/
	@Test
	public void myTest4(){
		Object myInstanceFromFactory = applicationContext.getBean("myInstanceFromFactory");
		System.out.println(myInstanceFromFactory.getClass().getName());
	}

}

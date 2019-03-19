package com.cskaoyan.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 16:06
 */
public class Men implements org.springframework.beans.factory.BeanNameAware,
		org.springframework.beans.factory.BeanFactoryAware{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("set");
		this.name = name;
	}

	public void initzz(){
		System.out.println("Men的init");
	}
	public void destroyzz(){
		System.out.println("Men的destroy");
	}

	public Men() {
		System.out.println("构造方法");
	}

	@Override
	public void setBeanName(String s) {
		System.out.println("BeanNameAware的setBeanName方法");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory");
	}
}

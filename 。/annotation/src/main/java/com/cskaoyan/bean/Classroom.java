package com.cskaoyan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


/**
 * Created by little Stone
 * Date 2019/3/19 Time 17:35
 */
@Component("classroom")
@Scope("prototype")
public class Classroom {
	//@Autowired
	//@Qualifier("suiyi")
	@Resource(name = "suiyi")
	User user;
	@PostConstruct
	public void init(){
		System.out.println("初始化");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("销毁");
	}

	@Override
	public String toString() {
		return "Classroom{" +
				"user=" + user +
				'}';
	}
}

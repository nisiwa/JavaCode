package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by little Stone
 * Date 2019/3/26 Time 11:50
 */
@Controller
public class HelloController {
	@RequestMapping("hello")
	public String hello(){
		System.out.println("hello");

		return "hello.jsp";
		//postHandle
	}
	@RequestMapping("user")
	public String user(){
		System.out.println("hello");

		return "hello.jsp";
		//postHandle
	}
	//afterCompletion

	@RequestMapping("user/hello")
	public String hello2(){
		System.out.println("user hello");

		return "/hello.jsp";
		//postHandle
	}
}

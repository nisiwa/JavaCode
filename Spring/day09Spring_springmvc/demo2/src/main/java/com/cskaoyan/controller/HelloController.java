package com.cskaoyan.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by little Stone
 * Date 2019/3/22 Time 17:55
 */
public class HelloController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("codex","hello springmvc");

		modelAndView.setViewName("/WEB-INF/view/hello.jsp");
		System.out.println("*************");
		return modelAndView;
	}
}

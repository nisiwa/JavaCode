package com.cskaoyan.controller;

import com.cskaoyan.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by little Stone
 * Date 2019/3/22 Time 17:55
 */
@Controller
@RequestMapping("/user")
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		ModelAndView modelAndView = new ModelAndView();


		modelAndView.addObject("codex","hello springmvc");

		modelAndView.setViewName("hello");
		System.out.println("*************");
		return modelAndView;
	}

	@RequestMapping(value = "/showUser" ,
			method = {RequestMethod.DELETE,RequestMethod.GET},
			params = {"username!=root","password"},
			headers = {"Content-Type=textz/html;charset=utf-8"})
	public ModelAndView showUser(){
		ModelAndView modelAndView = new ModelAndView();
		User user = new User("root","123456","mysql");

		modelAndView.addObject("user",user);
		modelAndView.setViewName("/WEB-INF/view/show.jsp");
		return modelAndView;
	}

	@RequestMapping("/returnVoid")
	public void returnVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("codex","hello springmvc");
		request.getRequestDispatcher("/WEB-INF/view/hello.jsp").forward(request,response);

	}
	@RequestMapping("/returnString")
	public String returnString(Model model) {
		model.addAttribute("codex","hello springmvc");
		return "redirect:hello";
	}
}

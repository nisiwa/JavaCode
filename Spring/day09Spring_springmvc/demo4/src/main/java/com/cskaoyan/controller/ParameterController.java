package com.cskaoyan.controller;

import com.cskaoyan.bean.QueryVo;
import com.cskaoyan.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by little Stone
 * Date 2019/3/25 Time 10:26
 */
@Controller
@RequestMapping("parameter")
public class ParameterController {
	/*@RequestMapping("hello")
	public String hello(HttpServletRequest request, Model model){
		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password, id,1);
		model.addAttribute("user",user);

		return "show";
	}
	@RequestMapping("baseType")
	public String base(String id,String username,String password,int age, Model model){

		User user = new User(username, password, id,age);
		model.addAttribute("user",user);

		return "show";
	}*/

	@RequestMapping("javabean")
	public String javabean(QueryVo queryVo,Model model)
	{
		model.addAttribute("queryvo",queryVo);
		return "show";
	}

	@RequestMapping("convertor")
	public String convertor(User user){
		System.out.println(user);
		return "show";
	}

	@RequestMapping("array")
	public String array(String[] ids)
	{
		System.out.println(Arrays.toString(ids));
		return "show";
	}

	@RequestMapping("userArray")
	public String userArray(User[] userList){
		System.out.println(Arrays.toString(userList));
		return "show";
	}
	@RequestMapping("list")
	public String list(QueryVo queryVo, Model model)
	{
		ArrayList<User> userList = queryVo.getUserList();
		for (User user: userList)
		{
			System.out.println("user :" + user);
		}
		model.addAttribute("users",userList);
		return "show";
	}
}

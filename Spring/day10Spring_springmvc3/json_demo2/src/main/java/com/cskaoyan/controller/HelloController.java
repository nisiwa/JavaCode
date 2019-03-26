package com.cskaoyan.controller;

import com.cskaoyan.bean.User;
import com.cskaoyan.vo.RequestUserVo;
import com.cskaoyan.vo.UserResVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by little Stone
 * Date 2019/3/26 Time 16:18
 */
@RestController
public class HelloController {



	@RequestMapping("hello")
	//@ResponseBody
	public User hello(){

		System.out.println("hello");
		User user1 = new User();
		user1.setUsername("root");
		user1.setPassword("123456");

		return user1;
	}

	@RequestMapping("queryUsers")
	@ResponseBody
	public UserResVo queryUsers(){
		//这部分是我在数据库做的查询
		List<User> users = new ArrayList<>();
		UserResVo userResVo = new UserResVo();
		userResVo.setUsers(users);
		userResVo.setSuccessCode(0);
		userResVo.setMessage("查询成功");

		return userResVo;
	}
	@RequestMapping("queryUserById")
	public UserResVo queryUser(@RequestBody RequestUserVo requestVo)
	{
		String id = requestVo.getId();
		String type = requestVo.getType();
		User user = queryUserByIdAndType(id,type);

		UserResVo userResVo = new UserResVo();
		ArrayList<User> users = new ArrayList<>();
		users.add(user);
		userResVo.setUsers(users);
		userResVo.setSuccessCode(0);
		userResVo.setMessage("query success");

		return userResVo;

	}

	private User queryUserByIdAndType(String id, String type) {
		User user = new User();
		user.setUsername("wangjinghai");
		user.setPassword("123456");


		return user;
	}
}

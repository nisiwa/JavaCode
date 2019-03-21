package com.cskaoyan.service.impl;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by little Stone
 * Date 2019/3/20 Time 10:54
 */
/*被代理类Target*/
@Component("myUserService")
public class UserServiceImpl implements UserService {
	@Override
	public User addUser(User user) {
		System.out.println("正在执行添加用户");
		//int i = 1/0;
		if (user != null && "zhangsan".equals(user.getUsername()))
		{
			return new User();
		}
		return new User();
	}
}

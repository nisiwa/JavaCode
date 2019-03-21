package com.cskaoyan.service.abc;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by little Stone
 * Date 2019/3/20 Time 10:54
 */
/*被代理类Target*/
@Component("abc")
public class UserServiceImpl implements UserService {
	@Override
	public int addUser(int x,User user) {
		System.out.println("正在执行添加用户");
		if (user != null && "zhangsan".equals(user.getUsername()))
		{
			return 1;
		}
		return 0;
	}
}

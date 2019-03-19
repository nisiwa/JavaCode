package com.cskaoyan.reflect;

import com.cskaoyan.service.UserService;
import com.cskaoyan.service.impl.UserServiceImpl;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 10:29
 */
public class ZZZ {
	public static void main(String[] args) throws Exception {
		Class<?> aClass = Class.forName("com.cskaoyan.service.impl.UserServiceImpl");
		UserServiceImpl o = (UserServiceImpl) aClass.newInstance();
	}

}

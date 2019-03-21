package com.cskaoyan.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 15:19
 */
@Component
public class User {
	@Value("lanzhao")
	String username;
	@Value("123456")
	String password;

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}

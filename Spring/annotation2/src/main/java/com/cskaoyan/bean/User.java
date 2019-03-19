package com.cskaoyan.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 17:23
 */
@Component("suiyi")
public class User {
	@Value("lzl")
	String username;


	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				'}';
	}
}

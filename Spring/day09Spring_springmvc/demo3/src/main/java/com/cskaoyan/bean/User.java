package com.cskaoyan.bean;

/**
 * Created by little Stone
 * Date 2019/3/23 Time 10:52
 */
public class User {
	String username;
	String password;
	String id;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User(String username, String password, String id) {
		this.username = username;
		this.password = password;
		this.id = id;
	}
}

package com.cskaoyan.bean;

import java.util.Date;

/**
 * Created by little Stone
 * Date 2019/3/23 Time 10:52
 */
public class User {
	String username;
	String password;
	String id;
	int age;
	Date birthday;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public User(String username, String password, String id, int age) {
		this.username = username;
		this.password = password;
		this.id = id;
		this.age = age;
	}

	public User(String username, String password, String id) {
		this.username = username;
		this.password = password;
		this.id = id;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", id='" + id + '\'' +
				", age=" + age +
				", birthday='" + birthday + '\'' +
				'}';
	}
}

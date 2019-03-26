package com.cskaoyan.vo;

import com.cskaoyan.bean.User;

import java.util.List;

/**
 * Created by little Stone
 * Date 2019/3/26 Time 16:53
 */
public class UserResVo extends ResponseVo {
	List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}

package com.cskaoyan.dao.impl;

import com.cskaoyan.bean.User;
import com.cskaoyan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 16:27
 */
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public User queryUserById(String id) {
		RowMapper<User> userBeanPropertyRowMapper = new BeanPropertyRowMapper<>(User.class);
		User user = jdbcTemplate.queryForObject("select id,username,password from j12_user_t where id = ?", userBeanPropertyRowMapper, id);
		return user;
	}
}

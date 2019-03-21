package com.cskaoyan.dao.impl;

import com.cskaoyan.bean.User;
import com.cskaoyan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 16:27
 */
@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
	@Autowired
	public void setMydatasource(DataSource dataSource){
		System.out.println("init datasource");
		this.setDataSource(dataSource);
	}
	@Override
	public User queryUserById(String id) {
		RowMapper<User> userBeanPropertyRowMapper = new BeanPropertyRowMapper<>(User.class);
		User user = this.getJdbcTemplate().queryForObject("select id,username,password from j12_user_t where id = ?", userBeanPropertyRowMapper, id);
		return user;
	}
}

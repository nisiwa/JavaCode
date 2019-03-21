package com.cskaoyan.jdbc.template;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 16:07
 */
public class MainTest {
	@Test
	public void myTest() throws PropertyVetoException {
		/*数据源datasource*/
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/j12_jdbc_template?serverTimezone=GMT");
		dataSource.setUser("root");
		dataSource.setPassword("123456");

		/*jdbcTemplate*/
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);

		Integer integer = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM j12_user_t", Integer.class);
		System.out.println("count = " + integer);
	}
}

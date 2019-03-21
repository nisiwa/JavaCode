package com.cskaoyan.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 16:52
 */
@Configuration
@ComponentScan(basePackages = "com.cskaoyan")
public class SpringConfig {
	/*@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
	}*/
	@Bean
	public DataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/j12_jdbc_template?serverTimezone=GMT");
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		return dataSource;
	}
}

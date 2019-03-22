package com.cskaoyan.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by little Stone
 * Date 2019/3/22 Time 14:48
 */
@Configuration
@ComponentScan(basePackages = "com.cskaoyan")
public class SpringConfig {

	@Bean
	public DataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/j12_jdbc_template?serverTimezone=GMT&useSSL=false");
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		return dataSource;
	}

	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource)
	{
		DataSourceTransactionManager dbTxManager = new DataSourceTransactionManager();
		dbTxManager.setDataSource(dataSource);
		return dbTxManager;
	}
	@Bean
	public TransactionTemplate transactionTemplate(DataSourceTransactionManager dbTxManager)
	{
		TransactionTemplate transactionTemplate = new TransactionTemplate();
		transactionTemplate.setTransactionManager(dbTxManager);
		return transactionTemplate;
	}

}

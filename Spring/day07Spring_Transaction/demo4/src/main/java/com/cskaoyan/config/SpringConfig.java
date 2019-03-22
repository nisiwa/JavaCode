package com.cskaoyan.config;

import com.cskaoyan.service.AccountService;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

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
	/*@Bean
	public TransactionTemplate transactionTemplate(DataSourceTransactionManager dbTxManager)
	{
		TransactionTemplate transactionTemplate = new TransactionTemplate();
		transactionTemplate.setTransactionManager(dbTxManager);
		return transactionTemplate;
	}*/
	@Bean("accountServiceFromProxy")
	public TransactionProxyFactoryBean transactionProxyFactoryBean(AccountService accountService,
	                                                               DataSourceTransactionManager transactionManager) throws ClassNotFoundException {
		TransactionProxyFactoryBean txProxyFactoryBean = new TransactionProxyFactoryBean();
		txProxyFactoryBean.setProxyInterfaces(new Class[]{Class.forName("com.cskaoyan.service.AccountService")});
		txProxyFactoryBean.setTarget(accountService);
		txProxyFactoryBean.setTransactionManager(transactionManager);

		Properties properties = new Properties();
		properties.setProperty("transfer","PROPAGATION_REQUIRED,ISOLATION_REPEATABLE_READ");


		txProxyFactoryBean.setTransactionAttributes(properties);


		return txProxyFactoryBean;
	}

}

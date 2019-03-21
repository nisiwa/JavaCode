package com.cskaoyan.config;

import com.cskaoyan.service.UserService;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 15:22
 */
@Configuration
@ComponentScan("com.cskaoyan")
public class SpringConfig {

	@Bean("userServiceFromFactory")
	public ProxyFactoryBean proxyFactoryBean(UserService userService){
		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
		proxyFactoryBean.setTarget(userService);
		proxyFactoryBean.setInterceptorNames("myadvice");
		return proxyFactoryBean;
	}
}

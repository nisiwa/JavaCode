package com.cskaoyan.jdbc.template;

import com.cskaoyan.bean.User;
import com.cskaoyan.config.SpringConfig;
import com.cskaoyan.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 17:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class MainTest {
	@Autowired
	UserDao userDao;
	@Test
	public void myTest(){
		System.out.println("aaa");
		User user = userDao.queryUserById("10");
		System.out.println(user);
	}
}

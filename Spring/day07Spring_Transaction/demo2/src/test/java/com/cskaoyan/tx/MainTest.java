package com.cskaoyan.tx;

import com.cskaoyan.config.SpringConfig;
import com.cskaoyan.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by little Stone
 * Date 2019/3/22 Time 11:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class MainTest {
	@Autowired
	AccountService accountService;
	@Test
	public void myTest1(){
		accountService.transfer("1","2",100);
	}
}

package com.cskaoyan.service.impl;

import com.cskaoyan.dao.AccountDao;
import com.cskaoyan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by little Stone
 * Date 2019/3/22 Time 11:50
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDao accountDao;

	/*@Autowired
	TransactionTemplate transactionTemplate;*/

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
	public void transfer(String fromId, String toId, int money) {

			int fromMoney = accountDao.queryMoneyById(fromId) - money;
			int toMoney = accountDao.queryMoneyById(toId) + money;
			//更新钱1
			accountDao.updateMoneyById(fromId, fromMoney);
			//制造异常
			int i = 10/0;
			accountDao.updateMoneyById(toId, toMoney);

	}
}

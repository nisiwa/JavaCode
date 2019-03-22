package com.cskaoyan.service.impl;

import com.cskaoyan.dao.AccountDao;
import com.cskaoyan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by little Stone
 * Date 2019/3/22 Time 11:50
 */
@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDao accountDao;

	@Autowired
	TransactionTemplate transactionTemplate;

	@Override
	public void transfer(String fromId, String toId, int money) {

		/*Integer execute = transactionTemplate.execute(new TransactionCallback<Integer>() {
			@Override
			public Integer doInTransaction(TransactionStatus transactionStatus) {
				*//*这儿是放业务逻辑*//*
				*//*查询 以及 算钱*//*
				int fromMoney = accountDao.queryMoneyById(fromId) - money;
				int toMoney = accountDao.queryMoneyById(toId) + money;

				*//*更新钱*//*
				accountDao.updateMoneyById(fromId, fromMoney);
				accountDao.updateMoneyById(toId, toMoney);
				return 1;
			}
		});*/
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				int fromMoney = accountDao.queryMoneyById(fromId) - money;
				int toMoney = accountDao.queryMoneyById(toId) + money;

				//更新钱
				accountDao.updateMoneyById(fromId, fromMoney);
				//制造异常
				int i = 1/0;
				accountDao.updateMoneyById(toId, toMoney);
			}
		});

	}
}

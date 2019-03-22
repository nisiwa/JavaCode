package com.cskaoyan.dao;

/**
 * Created by little Stone
 * Date 2019/3/22 Time 11:41
 */
public interface AccountDao {
	int queryMoneyById(String id);
	boolean updateMoneyById(String id, int money);
}

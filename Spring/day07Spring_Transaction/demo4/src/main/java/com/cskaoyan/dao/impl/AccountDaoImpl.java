package com.cskaoyan.dao.impl;

import com.cskaoyan.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by little Stone
 * Date 2019/3/22 Time 11:43
 */
@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	@Autowired
	public void setMyDatasource(DataSource datasource){
		this.setDataSource(datasource);
	}

	@Override
	public int queryMoneyById(String id) {
		String sql = "select money from j12_account_t where id = ?";
		return this.getJdbcTemplate().queryForObject(sql, Integer.class, id);

	}

	@Override
	public boolean updateMoneyById(String id, int money) {
		String sql = "update j12_account_t set money = ? where id = ?";
		int update = this.getJdbcTemplate().update(sql, money, id);
		return update == 1;
	}
}

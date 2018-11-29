package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService{
    //调用dao层
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层 查询所有...");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层 添加用户...");
        accountDao.saveAccount(account);
        return;
    }
}

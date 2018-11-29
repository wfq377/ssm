package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有
    List<Account> findAll();

    //添加用户
    void saveAccount(Account account);
}

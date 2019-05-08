package com.itheina.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    public void  setAccountDao(AccountDao accountDao){
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Integer money) {
        accountDao.out(outer,money);
        accountDao.in(inner,money);
    }
}

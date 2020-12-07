package com.joo.dao.Impl;

import com.joo.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * 账户持久层实现类
 */
@Repository(value = "accountDao")
public class AccountDaoImpl implements IAccountDao {


    @Override
    public void saveAccount() {
        System.out.println("保存了账户-----持久层实现类");

    }
}

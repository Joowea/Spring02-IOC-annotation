package com.joo.service.Impl;

import com.joo.dao.IAccountDao;
import com.joo.dao.Impl.AccountDaoImpl;
import com.joo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 账户业务层实现类
 */

@Service(value = "accountService")
public class AccountServiceImpl implements IAccountService {

    private String name;
    private Integer age;
    private Date date;

    @Autowired
    private IAccountDao accountDao;

    //private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {

        System.out.println("保存账户------业务层实现类");
        System.out.println("业务层操作人员："+name+"，年龄："+age+"，操作时间："+date);
        accountDao.saveAccount();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}

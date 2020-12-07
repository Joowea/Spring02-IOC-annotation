package com.joo.ui;

import com.joo.dao.IAccountDao;
import com.joo.service.IAccountService;
import com.joo.service.Impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    /**
     * 获取spring的IOC核心容器 并根据id获取对象
     * @param args
     */
    public static void main(String[] args) {

        //IAccountService as = new AccountServiceImpl();

        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        IAccountService aS = (IAccountService)ac.getBean("accountService");
        //IAccountDao aDao = ac.getBean("accountDao", IAccountDao.class);

        //System.out.println(aS);
        //System.out.println(aDao);
        aS.saveAccount();
    }
}

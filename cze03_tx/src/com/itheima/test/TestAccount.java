package com.itheima.test;

import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
    @Test
    public void demo1(){
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        AccountService accountService = (AccountService) applicationContext.getBean("accountServiceImpl");
        accountService.transfer("jack", "rose", 1000);
    }
}

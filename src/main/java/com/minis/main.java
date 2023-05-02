package com.minis;

import com.minis.beans.BeansException;
import com.minis.context.ClassPathXmlApplicationContext;
import com.minis.service.impl.BaseService;

public class main {
    public static void main(String[] args) throws BeansException, ClassNotFoundException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =new ClassPathXmlApplicationContext("beans.xml",true);
        BaseService baseService = (BaseService) classPathXmlApplicationContext.getBean("baseService");
        baseService.sayHello();
    }
}

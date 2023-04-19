package com.minis;

import com.minis.core.BeansException;
import com.minis.context.ClassPathXmlApplicationContext;
import com.minis.service.AService;

public class main {
    public static void main(String[] args) throws BeansException, ClassNotFoundException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =new ClassPathXmlApplicationContext("beans.xml");
        AService aService = (AService) classPathXmlApplicationContext.getBean("aservice");
        aService.sayHello();
    }
}

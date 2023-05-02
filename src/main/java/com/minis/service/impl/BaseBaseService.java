package com.minis.service.impl;

import com.minis.beans.factory.annotation.Autowired;

public class BaseBaseService {

    @Autowired
    private AServiceImpl aService;

    public AServiceImpl getAs() {
        return aService;
    }

    public void setAs(AServiceImpl aService) {
        this.aService = aService;
    }

    public BaseBaseService() {
    }

    public void sayHello() {
        System.out.println("Base Base Service says hello");
    }

}

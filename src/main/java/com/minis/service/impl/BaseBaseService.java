package com.minis.service.impl;

import com.minis.beans.factory.annotation.Autowired;

public class BaseBaseService {

    @Autowired
    private AServiceImpl as;

    public AServiceImpl getAs() {
        return as;
    }

    public void setAs(AServiceImpl as) {
        this.as = as;
    }

    public BaseBaseService() {
    }

    public void sayHello() {
        System.out.println("Base Base Service says hello");
    }

}

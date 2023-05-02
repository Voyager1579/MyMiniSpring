package com.minis.service.impl;

import com.minis.beans.factory.annotation.Autowired;

public class BaseService  {

    @Autowired
    private BaseBaseService baseBaseService;

    public BaseBaseService getBbs() {
        return baseBaseService;
    }

    public void setBbs(BaseBaseService baseBaseService) {
        this.baseBaseService = baseBaseService;
    }

    public BaseService() {
    }

    public void sayHello() {
        System.out.print("Base Service says hello");
        baseBaseService.sayHello();
    }
}

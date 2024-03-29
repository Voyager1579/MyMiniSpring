package com.minis.service.impl;

import com.minis.beans.factory.annotation.Autowired;
import com.minis.service.AService;

public class AServiceImpl implements AService {

    private String name;

    private int level;

    private String property1;

    private String property2;

    @Autowired
    private BaseService baseService;

    public AServiceImpl(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public AServiceImpl() {
    }

    public void setBs(BaseService baseService) {
        this.baseService = baseService;
    }

    public BaseService getBs() {
        return baseService;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    @Override
    public void sayHello() {
        System.out.println("A service 1 say hello");
    }
}

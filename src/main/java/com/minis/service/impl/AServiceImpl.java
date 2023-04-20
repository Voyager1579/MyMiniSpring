package com.minis.service.impl;

import com.minis.service.AService;

public class AServiceImpl implements AService {

    private String name;

    private int level;

    private String property1;

    private String property2;

    private BaseService bs;

    public AServiceImpl(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public AServiceImpl() {
    }

    public void setBs(BaseService bs) {
        this.bs = bs;
    }

    public BaseService getBs() {
        return bs;
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

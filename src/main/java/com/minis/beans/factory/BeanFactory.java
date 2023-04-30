package com.minis.beans.factory;


import com.minis.beans.BeansException;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    public void registerBean(String beanName, Object obj);

    boolean containsBean(String name);

    boolean isSingleton(String name);
    boolean isPrototype(String name);
    Class<?> getType(String name);
}

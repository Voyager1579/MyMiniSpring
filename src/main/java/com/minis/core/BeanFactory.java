package com.minis.core;



public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    public void registerBean(String beanName, Object obj);

    boolean containsBean(String name);

    boolean isSingleton(String name);
    boolean isPrototype(String name);
    Class<?> getType(String name);
}

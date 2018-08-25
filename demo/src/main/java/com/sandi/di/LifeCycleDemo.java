package com.sandi.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemo implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemo(){
        System.out.println("Hi, I am lifecycle demo's constructor");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Hi, I am lifecycle demo's BeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Hi, I am lifecycle demo's BeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Hi, I am lifecycle demo's destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hi, I am lifecycle demo's afterproperty set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Hi, I am lifecycle demo's setApplicationContext");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Hi, I am lifecycle demo's postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Hi, I am lifecycle demo's preDestroy");
    }

    public void beforeInit(){
        System.out.println("Hi, I am lifecycle demo's beforeInit");
    }

    public void afterInit(){
        System.out.println("Hi, I am lifecycle demo's afterInit");
    }


}

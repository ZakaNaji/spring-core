package com.znaji.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

public class Cat implements BeanNameAware {


    private String name;
    private String beanName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        beanName = name;
    }

    @PostConstruct
    public void initCat() {
        System.out.println("created cat bean with name: " + beanName);
    }
}

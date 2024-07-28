package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {

    private String name;

    public Person() {
        System.out.println("Instantiating the object");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setting Property");
    }

    @PostConstruct
    public void init() {
        System.out.println("Inside init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside destroy method");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

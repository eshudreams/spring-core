package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleMain {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle.xml");
        Object personObject = applicationContext.getBean("personObject");
        applicationContext.registerShutdownHook();
    }
}

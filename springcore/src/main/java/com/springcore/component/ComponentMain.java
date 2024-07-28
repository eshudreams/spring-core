package com.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("component.xml");
        Object person = applicationContext.getBean("eshan");
        System.out.println(person);
        Object person1 = applicationContext.getBean("eshan");
        System.out.println(person1);

    }
}

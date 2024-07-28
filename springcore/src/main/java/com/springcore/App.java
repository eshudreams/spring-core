package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Object employeeObject = applicationContext.getBean("employeeObject");
        System.out.println(employeeObject);
        Object personObject = applicationContext.getBean("personObject");
        System.out.println(personObject);
        Object wheelObject = applicationContext.getBean("wheelObject");
        System.out.println(wheelObject);
        Object carObject = applicationContext.getBean("carObject");
        System.out.println(carObject);

    }
}

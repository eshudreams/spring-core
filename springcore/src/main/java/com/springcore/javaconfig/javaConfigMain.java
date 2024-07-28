package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class javaConfigMain {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        Student student = applicationContext.getBean("eshan", Student.class);
        System.out.println(student.getSamosa());
        Student student1 = applicationContext.getBean("shende", Student.class);
        System.out.println(student1.getSamosa());
    }
}

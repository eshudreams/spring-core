package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Student {

    private Samosa samosa;

    public Student() {
        System.out.println("Default constructor is called");
    }

    public Student(Samosa samosa) {
        System.out.println("I am called");
        this.samosa = samosa;
    }

    @Autowired
    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }
}

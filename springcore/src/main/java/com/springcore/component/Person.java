package com.springcore.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("eshan")
@Scope("singleton")
public class Person {
    @Value("Eshan")
    private String name;
    @Value("35")
    private String age;

    @Value("#{mobileNumber}")
    private List<String> mobileNumber;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(List<String> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age='" + age + '\'' +
//                ", mobileNumber=" + mobileNumber +
//                '}';
//    }
}

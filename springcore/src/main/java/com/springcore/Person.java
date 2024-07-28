package com.springcore;

import java.util.List;

public class Person {

    private String name;
    private List<String> mobileNumbers;
    private String address;

    public Person() {
    }

    public Person(String name, List<String> mobileNumbers, String address) {
        this.name = name;
        this.mobileNumbers = mobileNumbers;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<String> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mobileNumber=" + mobileNumbers +
                ", address='" + address + '\'' +
                '}';
    }
}

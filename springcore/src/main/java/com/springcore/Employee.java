package com.springcore;

import java.util.Map;

public class Employee {
    private int id;
    private Map<String, String> accessForRooms;


    public Employee() {
    }

    public Employee(int id, Map<String, String> accessForRooms) {
        this.id = id;
        this.accessForRooms = accessForRooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, String> getAccessForRooms() {
        return accessForRooms;
    }

    public void setAccessForRooms(Map<String, String> accessForRooms) {
        this.accessForRooms = accessForRooms;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", acessForRooms=" + accessForRooms +
                '}';
    }
}

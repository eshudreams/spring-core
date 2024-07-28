package com.springcore.autowire;

public class Wheel {

    private String size;
    private String color;

    public Wheel() {
    }

    public Wheel(String size, String color) {
        this.size = size;
        this.color = color;
        System.out.println("Constructor: I am called");
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

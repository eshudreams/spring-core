package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    private Wheel wheel;

    private String color;

    private Double engine;

    public Car() {
        System.out.println("DefaultConstructor: I am called");
    }

    @Autowired
    public Car(Wheel wheel) {
        this.wheel = wheel;
        System.out.println("WheelConstructor: I am called");
    }


    public Car(Wheel wheel, String color, Double engine) {
        this.wheel = wheel;
        this.color = color;
        this.engine = engine;
        System.out.println("Constructor: I am called");
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
        System.out.println("SetWheel: I am called");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}

package com.springcore;

public class Car {

    private Wheel wheel;

    private String color;

    private Double engine;

    public Car() {
    }

    public Car(Wheel wheel, String color, Double engine) {
        this.wheel = wheel;
        this.color = color;
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
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

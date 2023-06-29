package com.inderjeet.test;

public abstract class Vehicle {

    private int wheels;
    private String color;

    public  Vehicle(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
    }

    public  int getWheels() { return wheels; }
    public String getColor() {return color; }

    public int calculate() {
        return wheels * 2;
    }

    public abstract void activateBreaks();

}


package com.test.xuleix.Model;

public class Car {
    private String brand;
    private int speed;
    private String color;
    public Car(String brand, int speed, String color) {
        this.brand = brand;
        this.speed = speed;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", speed=" + speed + ", color=" + color + "]";
    }

}
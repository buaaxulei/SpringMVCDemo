package com.test.xuleix.Model;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {

    @Autowired
    private Car car;

    public String showCar(){
        if(car != null){
            return car.toString();
        }
        return "No Car";
    }
}

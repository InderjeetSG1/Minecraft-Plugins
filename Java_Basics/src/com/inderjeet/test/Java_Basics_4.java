package com.inderjeet.test;

import java.util.ArrayList;
import java.util.List;

public class Java_Basics_4 {

    public static void main(String[] args){
//        List<Vehicle> vehicleList = new ArrayList<>();
//        vehicleList.add(new Car());
//        vehicleList.add(new Motorbike());
//
//        for (Vehicle vehicle : vehicleList) {
//            vehicle.activateBreaks();
//        }

        //Enumerators
        //built in java way to define constants
        //best bet if needed to have a bunch of related constants
//        CoffeeSize ordered = CoffeeSize.MEDIUM;
//        System.out.println("A customer has just ordered a " + ordered.getName() + " coffee for $" + ordered.getPrice());

        //Static
        //have to make everything static
        //breaks the power of OOP (Object Oriented)
        SecondClass.test();
    }
}

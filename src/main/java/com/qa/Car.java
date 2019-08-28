package com.qa;

public class Car extends Vehicle {

    String model;
    String owner;

    public Car(double engineSize, String colour, String type, String model, String owner) {
        super(engineSize, colour, type);
        this.model = model;
        this.owner = owner;


    }

    public String toString(){
        return "Owner: " + owner + "Model: " + model;
    }
}

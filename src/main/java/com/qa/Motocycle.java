package com.qa;

public class Motocycle extends Vehicle {

    String model;
    String owner;

    public Motocycle(double engineSize, String colour, String type, String model, String owner) {
        super(engineSize, colour, type);
        this.model = model;
        this.owner = owner;

    }


}

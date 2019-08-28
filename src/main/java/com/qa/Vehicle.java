package com.qa;

public class Vehicle {

    double engineSize;
    String colour;
    String type;

    public Vehicle(double engineSize, String colour, String type){
        this.engineSize = engineSize;
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String toString(){
        return "Engine Size: " + engineSize + "Type: " + type + "Colour: " + colour;
    }


}

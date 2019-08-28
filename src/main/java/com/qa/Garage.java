package com.qa;

import java.util.ArrayList;

public class Garage {

    String owner;
    static ArrayList<Vehicle> garage;
    String location;
    String doorColour;

    public Garage(String owner, ArrayList<Vehicle> vehicles, String location, String doorColour){
        this.owner = owner;
        this.garage = vehicles;
        this.location = location;
        this.doorColour = doorColour;
    }

    public static void main(String [] args){
        garage = new ArrayList<>();
        Car myCar = new Car(1500, "red", "car", "Mclaren", "Raj");
        Motocycle myCyle = new Motocycle(1000, "blue", "motorcycle", "ducati", "Raj");
        Car myCar2 = new Car(5000, "red", "car", "Ferrari", "Raj");
        Motocycle myCyle2 = new Motocycle(2000, "blue", "motorcycle", "Lambo", "Raj");
        garage.add(myCar);
        garage.add(myCyle);
        garage.add(myCar2);
        garage.add(myCyle2);
        Garage myGarage = new Garage("Raj", garage, "Glasgow", "Red" );
        for (Vehicle v: myGarage.getGarage()){
            if (v instanceof Car){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            }
        }




    public String getOwner() {
        return owner;
    }

    public static ArrayList<Vehicle> getGarage() {
        return garage;
    }

    public String getLocation() {
        return location;
    }

    public String getDoorColour() {
        return doorColour;
    }


}



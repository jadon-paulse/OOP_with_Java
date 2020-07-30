//package com.company;

public class Car extends Vehicle {
    private int numPassengers;
    private String colour;
    private int doors;

    Car(String colour, int passengers, int doors) {
        super(passengers, colour);
        this.numPassengers = passengers;
        this.colour = colour;
        this.doors = doors;
    }
    public String toString() {
        return colour + " " + numPassengers + " passengers " + doors + " doors";
    }
}

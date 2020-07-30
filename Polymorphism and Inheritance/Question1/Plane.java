//package com.company;

public class Plane extends Vehicle {
    private int numPassengers;
    private String colour;
    private int planeNum;
    private String planeName;


    Plane(String colour, int passengers, String name, int number) {
        super(passengers, colour);
        this.numPassengers = passengers;
        this.colour = colour;
        this.planeNum = number;
        this.planeName = name;
    }

    public String toString() {
        return colour + " " + numPassengers + " passengers "+ planeName + " " + planeNum;
    }
}

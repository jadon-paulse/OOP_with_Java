package com.company;

public class SoftDrink {


    private String[] details;
    private String name;
    private String colour;
    private String volume;


    public SoftDrink(String[] details){

       this.details = details;
       this.name = details[0];
       this.colour = details[1];
       this.volume = details[2];

    }

        public String displayList(){

        return name + ", " + colour + ", " + volume;

    }
}

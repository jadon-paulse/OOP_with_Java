package com.company;

public class UberService {

    String nameOfService;
    int baseFare;
    int costPerMinute;
    int costPerKilometre;
    int cancellationFee;


    public void setDetails(String name, int costPerMin, int costPerKim,
                           int baseFee, int cancelFee){
        this.nameOfService = name;
        this.baseFare = baseFee;
        this.costPerMinute = costPerMin;
        this.costPerKilometre = costPerKim;
        this.cancellationFee =  cancelFee;
    }

    public void setName(String name){
        this.nameOfService = name;
    }

    public String getName(){

        return nameOfService;
    }

    public void setCostPerMinute(int cents){

        this.costPerMinute = cents;
    }

    public int getCostPerMinute(){

        return costPerMinute;
    }

    public void setCostPerKilometre(int cents){

        this.costPerKilometre = cents;
    }

    public int getCostPerKilometre(){

        return costPerKilometre;
    }

    public void setBaseFare(int cents){

        this.baseFare = cents;
    }

    public int getBaseFare(){

        return baseFare;
    }

    public void setCancellationFee(int n){

        this.cancellationFee = n;
    }

    public int getCancellationFee(){

        return cancellationFee;
    }

    public double calculateFare(double minutes, double distance){

        return baseFare + (costPerMinute * minutes) + (costPerKilometre * distance);
    }
}

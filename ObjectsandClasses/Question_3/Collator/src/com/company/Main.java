package com.company;

public class Main {

//    private static final double EPSILON = .0001 ;

    public static void main(String[] args) {
        System.out.println("Test 1");
        Collator collator = new Collator("Steve");
        collator.recordReading(5);
        collator.recordReading(10);
        collator.recordReading(7);
        if(collator.label().equals("Steve")){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 2");
        collator.label("Frank");
        if(collator.label().equals("Frank")){
            System.out.println("Pass");
//            System.out.println(collator.label());
        }
        else{
            System.out.println("Fail");
        }

//        System.out.println("Test 3");
//        collator.recordReading(2);
//        if(collator.maximum() > collator.numberOfReadings()){
//            System.out.println("Pass");
//        }
//        else{
//            System.out.println("Fail");
//        }

//        System.out.println("Test 4");
//        if(collator.minimum() < collator.numberOfReadings()){
//            System.out.println("Pass");
//        }
//        else{
//            System.out.println("Fail");
//        }

        System.out.println("Test 5");
        if(collator.average() > collator.numberOfReadings()){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
            System.out.println(collator.average());
        }

        System.out.println("Test 6");
//        Collator c1 = new Collator("Book 1");
//        c1.recordReading(10);
//        c1.recordReading(20);
//        c1.recordReading(30);

        if(collator.maximum() == 10) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 7");
        if(collator.minimum() == 5) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 8");
        if(collator.numberOfReadings() == 3) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }
}

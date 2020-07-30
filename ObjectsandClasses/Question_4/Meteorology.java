//package com.company;

import java.util.Scanner;

public class Meteorology {
//public class Meteorology {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CollatorMeteor temp = new CollatorMeteor("temperature");
        CollatorMeteor press = new CollatorMeteor("pressure");
        CollatorMeteor hum = new CollatorMeteor("humidity");
        System.out.println("Meteorology Program");

        boolean running = true;

        while(running){
            System.out.println("Make a selection and press return:\n" +
                    "1. Record a temperature reading\n" +
                    "2. Record a pressure reading\n" +
                    "3. Record a humidity reading\n" +
                    "4. Print maximum values\n" +
                    "5. Print minimum values\n" +
                    "6. Print average values\n" +
                    "7. Quit.");
            String userChoice = input.nextLine();
//            String userValue = input.nextLine();
//            int value = Integer.parseInt(userValue);

            if(userChoice.equals("1")){
                System.out.println("Enter value: ");
                String userValue = input.nextLine();
                int value = Integer.parseInt(userValue);
                temp.recordReading(value);
            }
            if(userChoice.equals("2")){
                System.out.println("Enter value: ");
                String userValue = input.nextLine();
                int value = Integer.parseInt(userValue);
                press.recordReading(value);
            }
            else if(userChoice.equals("3")){
                System.out.println("Enter value: ");
                String userValue = input.nextLine();
                int value = Integer.parseInt(userValue);
                hum.recordReading(value);
            }
            else if(userChoice.equals("4")){
                if(hum.maximum() == 0 && press.maximum() == 0){
                    System.out.printf("Maximum temperature: %d%n", temp.maximum());
                    System.out.println("Maximum pressure: " + "-");
                    System.out.println("Maximum humitidy: "+ "-");
                }
                else{
                    System.out.printf("Maximum temperature: %d%n", temp.maximum());
                    System.out.printf("Maximum pressure: %d%n", press.maximum());
                    System.out.printf("Maximum humitidy: %d%n", hum.maximum());
                }

            }
            else if(userChoice.equals("5")){
                if(hum.minimum() == 0){
                    System.out.printf("Minimum temperature: %d%n", temp.minimum());
                    System.out.printf("Minimum pressure: %d%n", press.minimum());
                    System.out.println("Minimum humitidy: " + "-");
                }
                else{
                    System.out.printf("Minimum temperature: %d%n", temp.minimum());
                    System.out.printf("Minimum pressure: %d%n", press.minimum());
                    System.out.printf("Minimum humitidy: %d%n", hum.minimum());
                }

            }
            else if(userChoice.equals("6")){
                System.out.println("Average temperature: " + temp.average() + "0");
                System.out.println("Average pressure: " + press.average() + "0");
                System.out.println("Average humitidy: " + hum.average() + "0");
            }

            else if(userChoice.equals("7")){
                break;
            }
        }
    }
}

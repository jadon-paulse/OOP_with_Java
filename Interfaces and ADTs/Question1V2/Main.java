package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> drinksList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        boolean steve = false;
        System.out.println("Enter option: (1) add soft drink (2) quit: ");
        String userInput = input.nextLine();



        do {
            if (userInput.equals("1")) {
                System.out.println("Enter name, colour and volume in ml separated by space");
                String drink = input.nextLine();
                String[] parts = drink.split(" ");

//                SoftDrink choice = new SoftDrink(parts);
                drinksList.add(drink);

                System.out.println("Enter option: (1) add soft drink (2) quit: ");
                userInput = input.nextLine();

            }
            if (userInput.equals("2")) {
                for (SoftDrink list : drinksList) {
                    Collections.sort(drinksList);
                    System.out.println(list.displayList());
                }
                break;
            }
        }while(userInput != "2");
//            System.out.println("Steeeeeeeeeeeve");
    }
}

package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the minimum number of feet " +
                "(not less than 0): ");
        String minInput = userInput.nextLine();

        System.out.println("Enter the maximum number of feet " +
                "(not more than 30): ");
        String maxInput = userInput.nextLine();

        int min = Integer.parseInt(minInput);
        int max = Integer.parseInt(maxInput);

        System.out.println("     |    0\"     1\"      2\"     3\"      4\"       " +
                "5\"      6\"      7\"       8\"     9\"      10\"     11\" ");

        for(int i = min; i < max + 1; i++ ){

            System.out.format("%n%4d'|",i);

            for(int j = 0; j < 12; j++){

                double metres = (i * 12 + j) * 0.0254;

                System.out.format(" %.3f  ",metres);
            }
        }


    }
}

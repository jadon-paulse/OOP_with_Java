package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter starting point N: ");
        String start = userInput.nextLine();

        System.out.println("Enter end point M: ");
        String end = userInput.nextLine();

        int N = Integer.parseInt(start);
        int M = Integer.parseInt(end);

        System.out.println("The palindromic perfect squares are as follows: ");
        for (int i = N + 1; i < M; i++) {
            if (isPalindrome(i) && isPerfectSquare(i) ) {
                System.out.println(i);
            }

        }

    }

    public static boolean isPerfectSquare(int input){
        int squareRoot =(int) Math.sqrt(input);
        return ((squareRoot * squareRoot) == input);
    }

    public static boolean isPalindrome(int input){
        String str = Integer.toString(input);
        return new StringBuffer(str).reverse().toString().equals(str);
    }
}

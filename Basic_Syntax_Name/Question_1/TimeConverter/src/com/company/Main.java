package com.company;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System. in);
        System.out.println("Enter time ([h]h:mm [am|pm]: ");
        String input = scanner. nextLine();
        
        if(input.equals("12:00 am")){

            System.out.println("00:00");
        }
        else if(input.equals("00:00")){
            System.out.println(("12:00 am"));
        }

        else if(input.endsWith(" am")){
            System.out.println("0" + input.substring(0, 4));
        }

        else if(input.endsWith("m")){

            if(input.length() == 6){
                char c = input.charAt(0);
                int a=Character.getNumericValue(c);
//                System.out.println(a);
                int converted = a + 12;
                System.out.println(converted + input.substring(1, 4));
            }
            else{
                String c = input.substring(0, 1);
//                System.out.println(c);
                int i = Integer.parseInt(c);
//                System.out.println(i);
                int converted = i + 12;
                System.out.println(converted + input.substring(1, 4));
            }
        }
        else{
            String c = input.substring(0, 2);
            int i = Integer.parseInt(c);
            int converted = i - 12;
            System.out.println(converted + input.substring(2, 5) + " pm");
        }
//        for(int i = 0; i < input.length(); i++){
//            char c = input.charAt(i);
//            if(input.charAt(i) == "m")
//            System.out.println(c);
//        }
//
//        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mma");
//        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm");
//
//        System.out.println(date24Format.format(date12Format.parse(input)));

    }
}
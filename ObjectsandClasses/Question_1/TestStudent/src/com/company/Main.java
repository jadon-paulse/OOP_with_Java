package com.company;

public class Main {

    public static void main(String[] args) {
        // Test 1
        // Check setNames sets name and and getFullName returns name.
        System.out.println("Test 1");
        Student student = new Student();
        student.setNames("Patricia", "Nombuyiselo", "Noah");
        if (student.getFullName().equals("Patricia N. Noah")) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        // Test 2
        // Check getFullName returns name, and DOES NOT change the Student object.
        System.out.println("Test 2");
        student = new Student();
        student.setNames("Nomalizo", "Frances", "Noah");
        if (student.getFullName().equals(student.getFullName())) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        System.out.println(student.getFullName());
    }
}

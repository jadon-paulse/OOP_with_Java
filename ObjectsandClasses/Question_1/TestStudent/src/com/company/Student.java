package com.company;

import javax.crypto.spec.PSource;

public class Student {

    private String firstName;
    private String middleName;
    private String lastName;

//    public Student(String firstName, String middleName, String lastName) {
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//    }


    public void setNames(String first, String middle, String last){
        this.firstName = first;
        this.middleName = middle;
        this.lastName = last;

    }

    public String getFullName(){
        char intial = middleName.charAt(0);

        return firstName + " " + intial + ". " + lastName;
    }
}

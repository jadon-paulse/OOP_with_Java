package com.company;

public class Main {

    public static void main(String[] args) {

        ClockDisplay clockDisplay = new ClockDisplay(5, 30);
        clockDisplay.tick();
        System.out.println(clockDisplay.getDisplayValue());

        CounterDisplay counterDisplay = new CounterDisplay(3);
        counterDisplay.increment();
        counterDisplay.increment();
        System.out.println(counterDisplay.getDisplayValue());
        counterDisplay.increment();
        System.out.println(counterDisplay.getDisplayValue());
    }
}

//package com.company;

public class CounterDisplay {
    private int value;
    private int limit;

    public CounterDisplay(int pLimit) {
        this.limit = pLimit;
        this.value = 0;
    }

    public void setValue(int pValue){
        this.value = pValue;
    }

    public int getValue(){
        return value;
    }

    public void increment(){
        value++;
        if(value == limit){
            value = 0;
        }
    }

    public String getDisplayValue(){
        return "0" + value;
    }
}

//package com.company;

public class ClockDisplay{
    private CounterDisplay hours;
    private CounterDisplay minutes;

    public ClockDisplay(int pHours, int pMinutes) {
        hours = new CounterDisplay(24);
        hours.setValue(pHours);
        minutes = new CounterDisplay(60);
        minutes.setValue(pMinutes);
    }

    public String setTime(int pHours, int pMinutes){
        if(pHours < 10){
            return "0" + pHours + ":" + pMinutes;
        }
        else{
            return pHours + ":" + pMinutes;
        }
    }

    public void tick(){
        //Advance time by 1 minute
        minutes.increment();
    }

    public String getDisplayValue(){
        return setTime(hours.getValue(), minutes.getValue());
    }
}

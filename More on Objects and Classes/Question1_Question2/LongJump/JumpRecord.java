package com.company;

import javax.sound.midi.Soundbank;

public class JumpRecord {
    public double record;
    public int foul;
//    private int foulJump;
    public int jumps;
//    private double record;
    public int maximun;

//    private boolean finished;


    public void recordJump(double distance){
        if(!finished()){
            record = distance;
            jumps++;
        }
        else{
            System.out.println("Max jumps record is " + maxJumps());
        }
    }

    public int maxJumps(){
        maximun = 3;
        return maximun;
    }

    public int jumps(){
        return jumps;
    }

    public boolean finished(){

        if(jumps == maxJumps()){
            return true;
        }
        return false;
    }

    public boolean isFoulJump(int n){
        if(n <= jumps()){
            return false;
        }
        return true;
    }

    public void recordFoulJump(){
        if(!finished()){
            foul = 0;
        }else{
            foul++;
        }
    }

    public double getJumpDistance(int n){
        if(!isFoulJump(n)){
            return record;
        }
        return -1;
    }

    public int foulJumps(){
        return foul;
    }
}

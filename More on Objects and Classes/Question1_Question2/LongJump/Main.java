package com.company;

public class Main {

    public static void main(String[] args) {
        JumpRecord jump = new JumpRecord();
        System.out.println("Test 1");
        jump.recordJump(99.5);
        jump.recordJump(55.4);
        jump.recordJump(22.3);
        jump.recordJump(40.3);
        jump.recordFoulJump();
        if(jump.jumps() == 3){
            System.out.println("Pass");
//            System.out.println(jump.jumps);
        }
        else{
            System.out.println("Fail");
//            System.out.println(jump.jumps);
        }

        System.out.println("Test 2");
        if(jump.finished()){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 3");
        if(jump.maxJumps() == 3){
            System.out.println("Pass");
//            System.out.println(jump.jumps());
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 4");
        if(jump.foulJumps() == 1){
            System.out.println("Pass");
//            System.out.println(jump.foul);
        }
        else{
            System.out.println("Fail");
            System.out.println(jump.foulJumps());
        }

        System.out.println("Test 5");
        if(jump.getJumpDistance(3) == jump.record){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
            System.out.println(jump.getJumpDistance(4));
        }

        System.out.println("Test 6");
        if(jump.isFoulJump(4)){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}

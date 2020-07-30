package com.company;
public class NumberUtils {

    private NumberUtils(){

    }

    public static int[] toArray(int number){
        String n = Integer.toString(number);
        int[] intArray = new int[n.length()];

        for(int i = 0; i < n.length() ; i++){
            char c = n.charAt(i);
            int num = Character.getNumericValue(c);
            intArray[i] = num;
        }

        return intArray;
    }

    public static int countMatches(int numberA, int numberB) {

        int[] a = toArray(numberA);
        int[] b = toArray(numberB);

        int matchCount = 0;

//        for (int i = 0; i < a.length; i++) {
//            int xval = a[i];
        for (int j = 0; j < b.length; j++) {
            if (a[j] == b[j]) {
                matchCount++;
//                    System.out.println(a[j]);
            }
        }
//        }
        return matchCount;
    }


    public static int countIntersect(int numberA, int numberB){
        int[] arrayA = toArray(numberA);
        int[] arrayB = toArray(numberB);
        int count = 0;
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    count++;
                } else;
            }
        }
        return count;

    }
}

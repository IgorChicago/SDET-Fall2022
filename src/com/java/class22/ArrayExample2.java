package com.java.class22;

public class ArrayExample2 {
    public static void main(String[] args) {
        // add array separate negative to positive
        int num[] = {-12, 34, -45, 54, -23, 56, 78, -2, 21};
        int negativeSum = 0;
        int positiveSum = 0;
        int result = 0;
        for (int i = 0; i < num.length; i++) {

            if (num[i] < 0) {

                negativeSum++;
            } else {
                positiveSum++;

            }
        }
        System.out.println(negativeSum);
        System.out.println(positiveSum);
    }
}

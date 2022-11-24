package com.java.class14;

public class printNumbersFrom1_20DivisibleBy3 {
    public static void main(String[] args) {
        System.out.println("Printing numbers from 1 to 20 divisible by 3");

        int num = 0;

        while(num < 20){
            num++;

            if (num%3==0){
                System.out.println(num);
            }
        }
    }
}

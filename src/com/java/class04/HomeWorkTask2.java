package com.java.class04;

public class HomeWorkTask2 {
    public static void main(String[] args) {

        //Write a program to take one number and print whether it is divisible by 5 or not
        //For example, if num1 is 15, then the output should be "it is divisible by 5"
        //And, if num1 is 17, then the output should be "it is not divisible by 5"

        int num1 = 25;
        int num2 = 5;
        int num3 = num1/num2;

        if ( num3 % 5 == 0) {
            System.out.println("it is divisible by 5");
        } else {
            System.out.println("it is not divisible by 5");
        }

    }
}

package com.java.class22;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        //Write a program to find sum of the elements stored in the array
        int num[] = {10, 20, 30, 34, 45, 23, 45, 23};

        int result = 0;

        System.out.println("=======Print all data from array=======");

        for (int i = 0; i < num.length; i++) {

            result = result + num[i];
        }
        System.out.println(result);
    }
}

package com.java.class07;

import java.util.Scanner;

public class HomeWork7task1 {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner task1 = new Scanner(System.in);
        int number = task1.nextInt();

        if (number > 0) {
        System.out.println("Your number its positive and bigger than 0");
    } else if (number < 0) {
            System.out.println(" Your number is negative");
        } else {
            System.out.println("Your number is equal to 0");

        }
    }
}

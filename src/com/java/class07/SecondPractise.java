package com.java.class07;

import java.util.Scanner;

public class SecondPractise {
    public static void main(String[] args) {
        Scanner ID = new Scanner(System.in);
        System.out.println("Enter your age to verify if your are eligible for drive license");
        int age = ID.nextInt();
        if (age > 20) {
            System.out.println(" You are eligible for drive license");
        } else {
            System.out.println("Your are not eligible for driving license");

        }
    }
}

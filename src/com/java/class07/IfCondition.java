package com.java.class07;

import java.util.Scanner;

// Write a program to get two numbers from user and print maxim number
public class IfCondition {
    public static void main(String[] args) {
        Scanner class7 = new Scanner(System.in);
        System.out.println("Enter your first number");
        double num1 = class7.nextDouble();
        System.out.println("Enter your second number");
        double num2 = class7.nextDouble();
        System.out.println("Your bigest number is :");
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}

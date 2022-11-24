package com.java.class11;

import java.util.Scanner;

public class CalculatorInSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please choose your operation: ");
        System.out.println("add for Addition");
        System.out.println("sub for Subtraction");
        System.out.println("mul for Multiplication");
        System.out.println("div for Division");

        String calculator = sc.next();

        switch (calculator.toLowerCase()) {

            case "add":
                System.out.println(num1 + num2);
                break;
            case "sub":
                System.out.println(num1 - num2);
                break;
            case "mul":
                System.out.println(num1 * num2);
                break;
            case "div":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Error");
        }
    }
}

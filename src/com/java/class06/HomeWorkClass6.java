package com.java.class06;

import java.util.Scanner;

public class HomeWorkClass6 {
    public static void main(String[] args) {
        Scanner homeWork = new Scanner(System.in);
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("Task 1");
        System.out.println("Enter your number to find the square");
        int num1 = homeWork.nextInt();
        System.out.println("Your square number will be");
        System.out.println(num1*num1);

        //Task2

        System.out.println("///////////////////////////////////////////////////////");
        System.out.println("Task 2");
        System.out.println("Calculation of simple interest");
        System.out.println("Enter the Principle amount");
        int num2 = homeWork.nextInt();
        System.out.println("Enter number of years the loan is taken for");
        double num3 = homeWork.nextDouble();
        System.out.println("Enter the rate of the interest for the loan");
        double num4 = homeWork.nextDouble();
        double num5 = (num2*num3*num4)/100;
        System.out.println("Your Simple Interest will be $" + num5);

        //Task3
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("Task 3");
        System.out.println("Calculating total bill amount after Discount");
        System.out.println("Enter your bill amount");
        double num6 = homeWork.nextDouble();
        System.out.println("Enter your discount percentage");
        double num7 = homeWork.nextDouble();
        //Calculating total bill amount
        double num8 = (num6*num7)/100;
        double num9 = num6 - num8;
        System.out.println("Your total bill will be: $ " +num9);

    }
}
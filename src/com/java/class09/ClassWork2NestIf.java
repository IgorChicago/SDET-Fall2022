package com.java.class09;

import java.util.Scanner;

public class ClassWork2NestIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " Number 1 is the biggest");
            } else {
                System.out.println(num3 + " Number 3 is the biggest");
            }
        } else if (num2 > num3) {
            System.out.println(num2 + " Number 2 is the biggest");
        } else {
            System.out.println(num3 + " Number 3 is the biggest");
        }
    }
}


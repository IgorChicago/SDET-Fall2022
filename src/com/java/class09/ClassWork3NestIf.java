package com.java.class09;

import java.util.Scanner;

public class ClassWork3NestIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        int salary = sc.nextInt();

        if (age >= 18) {
            if (salary < 5000) {
                System.out.println("Need to get second job");
            } else if (salary >= 20000) {
                System.out.println("Good for FREE credit card");
            } else {
                System.out.println("Good for credit card");
            }
        } else {
            System.out.println("To young for credit card");

        }
    }
}

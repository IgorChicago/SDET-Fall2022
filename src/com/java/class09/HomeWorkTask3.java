package com.java.class09;

import java.util.Scanner;

public class HomeWorkTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of bill");
        int amount = sc.nextInt();

        while (amount > 0) {

            if (amount >= 500) {
                System.out.println("You have " + amount / 500 + " of $500");
                amount = amount % 500;
            } else if (amount >= 200) {
                System.out.println("You have " + amount / 200 + " of $200");
                amount = amount % 200;
            } else if (amount >= 100) {
                System.out.println("You have " + amount / 100 + " of $100");
                amount = amount % 100;
            } else if (amount >= 50) {
                System.out.println("You have " + amount / 50 + " of $50");
                amount = amount % 50;
            } else if (amount >= 20) {
                System.out.println("You have " + amount / 20 + " of $20");
                amount = amount % 20;
            } else if (amount >= 10) {
                System.out.println("You have " + amount / 10 + " of $10");
                amount = amount % 10;
            } else if (amount >= 5) {
                System.out.println("You have " + amount / 5 + " of $5");
                amount = amount % 5;
            } else if (amount >= 2) {
                System.out.println("You have " + amount / 2 + " of $2");
                amount = amount % 2;
            } else if (amount >= 1) {
                System.out.println("You have " + amount / 1 + " of $1");
                amount = amount % 1;

            }
        }
    }
}


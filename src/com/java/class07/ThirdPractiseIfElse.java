package com.java.class07;

import java.util.Scanner;

public class ThirdPractiseIfElse {
    public static void main(String[] args) {
        Scanner third = new Scanner(System.in);
        System.out.println("Please enter your day: ");
        int day = third.nextInt();

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
        } else {
            System.out.println("Please have enter only 0-6");
        }
    }
}

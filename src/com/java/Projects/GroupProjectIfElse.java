package com.java.Projects;

import java.util.Scanner;

public class GroupProjectIfElse {
    public static void main(String[] args) {

        /**
         *
         * A company decided to give a bonus of 3% if his/her year of service is more than 3 years inclusively and 5% to employee if his/her year of service is more than 5 years exclusively.
         * Ask user for their salary and year of service and print the net bonus amount.
         * example output:
         * Enter you salary:
         * 100000
         * Enter years of service:
         * 3
         * Your bonus is 3000.0
         */
        Scanner sc = new Scanner(System.in);

        double bonus = 0;

        //TODO implement your code here...
        //Scanner sc = new Scanner(System.in);

        System.out.println("Enter you salary:");
        int salary = sc.nextInt();

        System.out.println("Enter years of service:");
        int yearOfService = sc.nextInt();

        if (yearOfService > 5) {
            bonus = ((salary * 5) / 100);

        } else if (yearOfService > 3) {
            bonus = ((salary * 3) / 100);

            System.out.println(" Your bonus is $" + bonus);

        } else {
            System.out.println("Try next year for bonus");

        }
    }
}


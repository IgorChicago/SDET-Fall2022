package com.java.class11;

import java.util.Scanner;

public class DaysOfTheWeekHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to print the day of the week");
        int num = sc.nextInt();
        switch (num){
            case 0:
            System.out.println("Sunday");
            break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter only from 0-6. Good luck next time");

        }
    }
}

package com.java.class09;

import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to find if its Leap Year");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}

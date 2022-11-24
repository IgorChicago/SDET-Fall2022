package com.java.class09;

import java.util.Scanner;

public class ClassWork1 {
    public static void main(String[] args) {
        //If else example
        //Write a program to get age and weight from the user and print message based on fallowing condition
        // 1. user has age more than or equal to 18 and weight more than equal then they are eligible for blood donation
        // 2 if user has age less than 18 and weight greater than 50 then print you're too young to donate blood
        // 3. if user has age greater than 18 and weight less than 50 then
        // print you're underweight. Please eat more and try again
        // 4. If user has age less than 18 and weight less than 50 then
        // print, you're not eligible

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextByte();
        System.out.println("Enter your weight:");
        int weight = sc.nextInt();

        if (age >= 18 && weight > 50) {
            System.out.println("You are eligible for blood donation");
        } else if (age >= 18 && weight < 50) {
            System.out.println("You are not eligible for blood donation, " +
                    "because you are underweight");
        } else if (age < 18 && weight > 50) {
            System.out.println("You are to young for blood donation");
        } else if (age < 18 && weight < 50) {
            System.out.println("You are eligible for blood donation");

            // 2nd approach - nested if-else
            //  if(age >= 18){
            //    if(weight >=50){
            //     System.out.println("You're eligible");
            //    }else{
            //      System.out.println("you're underweight");
            //   }
            // }else{
            //   if(weight >=50){
            //       System.out.println("you're too young to donate blood");
            //   }else{
            //      System.out.println("you're not eligible");
        }

        }
    }




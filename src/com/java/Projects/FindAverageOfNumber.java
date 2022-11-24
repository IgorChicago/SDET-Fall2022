package com.java.Projects;

import java.util.Scanner;

public class FindAverageOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = sc.nextInt();

        System.out.println("You have spend " + age *12 +" months on earth" );

        System.out.println("You have spend " + age *365 + " those days on earth");

        System.out.println("You have spend " + age *365*24*60 + " minutes on earth");


    }
}

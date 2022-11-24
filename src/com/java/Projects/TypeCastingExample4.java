package com.java.Projects;



import java.util.Scanner;

public class TypeCastingExample4 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Provide your number");
        double a = SC.nextDouble();

        System.out.println("Provide your next number");
        double b = SC.nextDouble();

        System.out.println("Provide your next number");
        double c = SC.nextDouble();

        System.out.println("Your average result is");
        System.out.println((a+b+c)/3.0);

    }
}

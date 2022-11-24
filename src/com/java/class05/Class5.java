package com.java.class05;

import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce first number");
        int a = sc.nextInt();

        System.out.println("Introduce second number");
        int b = sc.nextInt();
                int c;
        a=a*a;
        b=a*b;

        b=a+b;
        a=a+b;


        System.out.println(a);
        System.out.println(b);
    }
}

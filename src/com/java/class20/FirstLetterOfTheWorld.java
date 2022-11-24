package com.java.class20;

import java.util.Scanner;

public class FirstLetterOfTheWorld {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter your full name");

        String str = sc.nextLine();

        String initials = " " + str.charAt(0);

        initials = str.charAt(0)+ "." +str.charAt(str.indexOf(" ")+1)+".";

            System.out.println(initials);

        }
    }


package com.java.class21;

import java.util.Scanner;

//Java Program to determine whether a given string is palindrome or not by ignoring the case of characters and white spaces
//        Example
//        Input - Was it a car or a cat I saw
//        Output - Palindrome (edited)

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a string to check for Palindrome");

        String str = sc.nextLine();
        str = str.toLowerCase();
        str=str.replaceAll(" ", "");

        String reversed = "";

        for (int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + reversed;
        }

        if (str.equalsIgnoreCase(reversed)){

            System.out.println("Palindrome");
        }else{
            System.out.println(" Not Palindrome");
        }
        System.out.println(reversed);
    }
}

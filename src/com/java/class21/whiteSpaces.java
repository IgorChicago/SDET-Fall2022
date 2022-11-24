package com.java.class21;

import java.util.Scanner;

//Java Program to remove all the white spaces from a string
//        Example
//        Input - Today is Saturday
//        Output - TodayisSaturday

public class whiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your String");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            String fraze = "";

            if (str.charAt(i) == ' ') {

            } else {

                fraze = fraze + str.charAt(i);
            }
            System.out.print(fraze);
        }
    }
}




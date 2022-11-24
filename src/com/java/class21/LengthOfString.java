package com.java.class21;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your full name");

        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println(count);
//second method
        System.out.println(str.lastIndexOf(" "));
    }
}


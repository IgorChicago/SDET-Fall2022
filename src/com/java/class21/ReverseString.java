package com.java.class21;

import java.util.Scanner;

public class ReverseString {
// reversing the Strings "words"

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your full name");

        String str = sc.nextLine();

        for (int i = str.lastIndexOf(" "); i >= 0; i--) {
            System.out.print(str.charAt(i));

            //second methode to get done
            for (int j = str.length() - 1; j >= 0; j--) {
                System.out.println(str.charAt(j));

                //another approach

                for (int a = 0; a < str.length(); a++) {
                    System.out.println(str.charAt(str.length() - 1 - a));

                }
            }
        }
    }
}

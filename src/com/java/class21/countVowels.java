package com.java.class21;

import java.util.Scanner;
//Java Program to count the total number of vowels and consonants in a string
//        Example
//        Input - Today is Saturday
//        Output - Total Vowels - 6, Total Consonants -  9

public class countVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string: ");

        String word = sc.nextLine();
        word = word.toLowerCase();
        int vowels = 0;
        int constants = 0;

        for (int i = 0; i < word.length(); i++) {

            if (Character.isAlphabetic(word.charAt(i))) {
                switch (word.charAt(i)) {
                    case 'a':
                    case 'o':
                    case 'i':
                    case 'u':
                    case 'e':
                        vowels++;
                        break;
                    default:
                        constants++;
                }
            }
        }
        System.out.println(" Vowels: " + vowels);
        System.out.println(" Constants: " + constants);
    }
}

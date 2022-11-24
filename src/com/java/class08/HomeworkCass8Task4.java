package com.java.class08;

import java.util.Scanner;

public class HomeworkCass8Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your character ");
        char charact = sc.next().charAt(0);

        if (charact == 'a') {
            System.out.println("Your character is Vowel");
        } else if (charact == 'e') {
            System.out.println("Your character is Vowel");
        } else if (charact == 'i') {
            System.out.println("Your character is Vowel");
        } else if (charact == 'o') {
            System.out.println("Your character is Vowel");
        } else if (charact == 'u') {
            System.out.println("Your character is Vowel");
        } else {
            System.out.println("Your letter " + charact +" its not Vowel");
        }
    }
}

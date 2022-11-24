package com.java.class05;

import java.util.Scanner;

public class Class5HomeWorkTask2 {
    public static void main(String[] args) {
        // creating object of scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Hello");
        String word1 = sc.nextLine();

        System.out.println("Please enter World");
        String word2 = sc.nextLine(), word3;

        word3 = word2;
        word2 = word1;
        word1 = word3;

        System.out.println(word1);
        System.out.println(word2);
    }
}
package com.java.Projects;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        /**
         * Write a function that concatenates two words into single,
         * however if the concatenation creates a similar double char, then omit one of the character's
         * ex:
         * "abc" "cat" -> "abcat"
         *
         * ex2:
         * abc", "xyz" -> "abcxyz"
         *
         * ex3:
         * "happy", "yolk" -> happyolk
         */
        //TODO WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word1 = sc.nextLine();
        System.out.println("Please another word:");
        String word2 = sc.nextLine();
        System.out.println(concat(word1, word2));
    }

    public static String concat(String word1, String word2) {
        // TODO IMPLEMENT METHOD
        String conWords = word1;
        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            conWords = conWords + word2.substring(1);
        } else {
            conWords = conWords + word2;
        }
        return conWords;
    }
}

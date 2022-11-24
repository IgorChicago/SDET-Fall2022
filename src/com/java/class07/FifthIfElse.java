package com.java.class07;

import java.util.Scanner;

public class FifthIfElse {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Introduce the student points to identify the grade 0-100");
        int points = marks.nextInt();

        if (points >= 101) {
            System.out.println("Error");
        } else if (points >= 90 ) {
            System.out.println("Student got A+");
        } else if (points >= 80 ) {
            System.out.println("Student got A");
        } else if (points >= 70 ) {
            System.out.println("Student got B+");
        } else if (points >= 60 ) {
            System.out.println("Student got B");
        } else if (points >= 50 ) {
            System.out.println("Student got C+");
        } else if (points >= 40 ) {
            System.out.println("Student got C");
        } else if (points < 40) {
            System.out.println("Error");
        }else {
            System.out.println("Please enter student points from 40-100");
        }

    }
}





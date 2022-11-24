package com.java.class07;

import java.util.Scanner;

public class FourPracticeIfElse {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Introduce the student points to identify the grade ");
        int points = marks.nextInt();

        if (points > 90) {
            System.out.println("Student got A+");
        } else if (points >= 80 && points <= 89 ) {
            System.out.println("Student got A");
        } else if (points >= 70 && points <= 79) {
            System.out.println("Student got B+");
        } else if (points >= 60 && points <= 69) {
            System.out.println("Student got B");
        } else if (points >= 50 && points <= 59) {
            System.out.println("Student got C+");
        } else if (points >= 40 && points <= 49) {
            System.out.println("Student got C");
        } else if (points < 40) {
            System.out.println("Student got F");
        }else {
            System.out.println("Student Fail");
        }
        {
        }
    }
}

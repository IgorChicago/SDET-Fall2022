package com.java.class08;

import java.util.Scanner;

public class HomeworkClass8Task3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter your rating to figure out company Reputation");
        int num = sc.nextInt();

        if (num==5) {
            System.out.println("Company reputation is Very Good");
        } else if (num==4) {
            System.out.println("Company reputation is Good");
        } else if (num==3) {
            System.out.println("Company reputation is Average");
        } else if (num==2) {
            System.out.println("Company reputation is Poor");
        } else if (num==1) {
            System.out.println("Company reputation is Very Poor");
        }

    }
}

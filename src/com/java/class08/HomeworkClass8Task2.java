package com.java.class08;

import java.util.Scanner;

public class HomeworkClass8Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bill amount to calculate your final bill after discount");
        int bill = sc.nextInt();

        if (bill >= 10000) {
            System.out.println("Your bill is: " + (bill-((bill * 20) / 100)) + " after 20% discount");

        } else if (bill >= 5000 ) {
            System.out.println("Your bill is: " + (bill-((bill * 15) / 100)) + " after 15% discount");

        } else if (bill >= 2000 ) {
            System.out.println("Your bill is: " + (bill-((bill * 10) / 100)) + " after 10% discount");

        } else if (bill >= 1000 ) {
            System.out.println("Your bill is: " + (bill-((bill * 5) / 100)) + " after 5% discount");

        }else {
            System.out.println(" Your bill is: "+ bill+ " no discount for this amount");
        }

    }
}

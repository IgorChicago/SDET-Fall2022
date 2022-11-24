package com.java.class11;

import java.util.Scanner;

public class FindNumOfTheDaysInMonth {
    public static void main(String[] args) {

        System.out.println("Please enter your month number: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        switch(num){
            case 1:
            case 3:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 2:
                System.out.println("28/29 Days");
                break;
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            default:
                System.out.println("Please enter number from 1 to 12 only");
        }
    }
}


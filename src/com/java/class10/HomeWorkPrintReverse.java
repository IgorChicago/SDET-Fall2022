package com.java.class10;

import java.util.Scanner;

public class HomeWorkPrintReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your three digits number");
        int num = sc.nextInt();
        //Reverse number 529 to 925

        if (num>=100 && num<=999) {
            int num1 = num/100; // 5
            int num2 = ((num%100)/10)*10; // 2
            int num3 = ((num%100)%10)*100; //
            System.out.println("Your number reversed  is " + (num3+num2+num1));

        }else{
            System.out.println("Next time enter three digits number, the end of the program");
        }
    }
}

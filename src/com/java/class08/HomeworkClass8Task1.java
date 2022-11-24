package com.java.class08;

import java.util.Scanner;

public class HomeworkClass8Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to verify if its divided by 5");
        int num = sc.nextInt();

        if ((num%5)==0) {
            System.out.println(num + " It's  divisible by 5");
        }else {
            System.out.println(num + " It's not divisible by 5");
        }
    }
}

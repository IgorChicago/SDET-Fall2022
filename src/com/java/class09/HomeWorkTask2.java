package com.java.class09;

import java.util.Scanner;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Power usage amount");
        int usage = sc.nextInt();
        if (usage<=200) {
            System.out.println("Your bill is " + (usage * 0.5));
        } else if (usage<=400) {
            System.out.println("Your bill is " + (usage * 0.65));
        } else {
            System.out.println("Your bill is " + (usage * 0.80));

        }

    }

}

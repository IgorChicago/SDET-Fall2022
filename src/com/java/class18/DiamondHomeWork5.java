package com.java.class18;

public class DiamondHomeWork5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int s = 5; s >= i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int s = 5; s >= i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}



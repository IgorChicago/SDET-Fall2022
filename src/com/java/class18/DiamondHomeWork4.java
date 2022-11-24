package com.java.class18;

public class DiamondHomeWork4 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int s=5; s>=i; s--){
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=4; i>=1; i--){
            for (int s=5; s>=i; s--){
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



package com.java.class18;

public class PyramidHomeWork2 {
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
    }
}

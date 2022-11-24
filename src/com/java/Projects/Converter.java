package com.java.Projects;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        /**
         * Write a java program that calculates to metric system
         * if incorrect input print result as -1
         *
         * 1 lb = 0.45359237 kg
         * 1 oz = 28.34952 g
         *
         * 1 ft = 0.3048 m
         * 1 ft = 30.48 cm
         * 1 in = 2.54cm
         *
         * C = (F - 32) × 5/9
         *
         * Example output:
         * Enter amount:
         * 1
         * Enter type:
         * in
         * To:
         * cm
         * Result: 2.54
         *
         */

        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();
        double amount, result;
        String type, to;


        System.out.println("Enter amount: ");
        amount = scanner.nextDouble();
        System.out.println("Enter type: ");
        type = scanner.next();
        System.out.println("To:");
        to = scanner.next();

        if (converter.isWeight(type) && converter.isWeight(to)) {
            result = converter.calculateWeight(type,to,amount);

        }else if (converter.isLength(type) && converter.isLength(to)) {
            result = converter.calculateLength(type,to,amount);

        }else if (converter.isTemperature(type)&& converter.isTemperature(to)) {
            result = converter.calculateTemperature(type,to,amount);

        }else {
            result = -1;
        }
        converter.printResult(result);
    }


    public boolean isWeight(String type) {
        switch (type) {
            case "kg":
            case "lb":
            case "oz":
            case "g":
                return true;
            default:
                return false;
        }
    }

    public boolean isLength(String type) {
        return type.equalsIgnoreCase("ft") ||
                type.equalsIgnoreCase("cm") ||
                type.equalsIgnoreCase("m") ||
                type.equalsIgnoreCase("in");
    }

    public boolean isTemperature(String type) {
        return type.equalsIgnoreCase("C") ||
                type.equalsIgnoreCase("F");
    }

    public double calculateWeight(String type, String to, double amount) {
        switch (type) {
            case "kg":
                if (to.equalsIgnoreCase("lb")) {
                    return amount * 2.2;

                } else if (to.equalsIgnoreCase("oz")) {
                    return amount * 35.274;

                } else if (to.equalsIgnoreCase("g")) {
                    return amount * 1000;

                } else if (to.equalsIgnoreCase("kg")) {
                    return amount;
                } else
                    return -1;
            case "lb":
                if (to.equalsIgnoreCase("kg")) {
                    return amount * 0.45359237;

                } else if (to.equalsIgnoreCase("oz")) {
                    return amount * 16;

                } else if (to.equalsIgnoreCase("g")) {
                    return amount * 453.592;

                } else if (to.equalsIgnoreCase("lb")) {
                    return amount;
                } else
                    return -1;
            case "oz":
                if (to.equalsIgnoreCase("lb")) {
                    return amount * 0.0625;

                } else if (to.equalsIgnoreCase("kg")) {
                    return amount / 35.274;

                } else if (to.equalsIgnoreCase("g")) {
                    return amount * 28.3495;

                } else if (to.equalsIgnoreCase("oz")) {
                    return amount;
                } else
                    return -1;
            case "g":
                if (to.equalsIgnoreCase("lb")) {
                    return amount * 0.00220462;

                } else if (to.equalsIgnoreCase("kg")) {
                    return amount / 1000;

                } else if (to.equalsIgnoreCase("oz")) {
                    return amount / 28.35;

                } else if (to.equalsIgnoreCase("g")) {
                    return amount;
                } else
                    return -1;
        }
        return amount;
    }


    public double calculateLength(String type, String to, double amount) {
        switch (type) {

            case "ft":
                if (to.equalsIgnoreCase("cm")) {
                    return amount * 30.48;

                } else if (to.equalsIgnoreCase("m")) {
                    return amount / 3.281;

                } else if (to.equalsIgnoreCase("in")) {
                    return amount * 12;

                } else if (to.equalsIgnoreCase("ft")) {
                    return amount;
                } else
                    return -1;

            case "in":
                if (to.equalsIgnoreCase("cm")) {
                    return amount * 2.54;

                } else if (to.equalsIgnoreCase("m")) {
                    return amount / 39.37;

                } else if (to.equalsIgnoreCase("ft")) {
                    return amount / 12;

                } else if (to.equalsIgnoreCase("in")) {
                    return amount;
                } else
                    return -1;

            case "m":
                if (to.equalsIgnoreCase("cm")) {
                    return amount * 100;

                } else if (to.equalsIgnoreCase("ft")) {
                    return amount * 3.28084;

                } else if (to.equalsIgnoreCase("in")) {
                    return amount * 39.37;

                } else if (to.equalsIgnoreCase("m")) {
                    return amount;
                } else
                    return -1;

            case "cm":
                if (to.equalsIgnoreCase("ft")) {
                    return amount / 30.48;

                } else if (to.equalsIgnoreCase("in")) {
                    return amount / 2.54;

                } else if (to.equalsIgnoreCase("m")) {
                    return amount / 100;

                } else if (to.equalsIgnoreCase("cm")) {
                    return amount;
                } else {
                    return -1;
                }
        }
        return amount;
    }
    public double calculateTemperature (String type, String to,double amount){
        double result = -1;

        if (type.equalsIgnoreCase("C") && to.equalsIgnoreCase("F")) {
            result = (amount * 9 / 5) + 32;
        } else if (type.equalsIgnoreCase("F") && to.equalsIgnoreCase("C")) {
            result = (amount - 32) * 5 / 9;
        }
        return result;
    }
    public void printResult ( double result){
        System.out.println("Result: " + result);
    }
}
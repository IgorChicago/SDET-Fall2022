package com.java.Projects;

import java.util.Scanner;

public class stringAddressProject {
    public static void main(String[] args) {

            /**
             * Write a program that provides more specific information about address
             * Any address can be inserted instead of a given address
             * get street address, city, state, and zipcode in separate variables and print them out
             */
            Scanner sc = new Scanner(System.in);

            //String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";

            System.out.println(" Please enter full address");
            String address= sc.nextLine();

            //TODO WRITE YOUR CODE HERE

            System.out.println("Street address will be: " + getStreetAddress(address));
            System.out.println(" City will be: " + getCity(address));
            System.out.println(" State will be: " + getState(address));
            System.out.println(" ZipCode will be: "+ getZipcode(address));
        }

        // TODO IMPLEMENT ALL METHODS
        public static String getStreetAddress(String address) {
            String result = " ";

            for (int i = 0; i < address.length(); i++) {

                if (address.charAt(i) == ',') {
                    result = address.substring(0, i);
                    return result;
                }
            }
            return result;
        }

        public static String getCity(String address) {
            String resultCity = " ";

            int cityIndex = address.indexOf(',')+1;

            int cityIndex2 = address.lastIndexOf(',');

            resultCity = address.substring(cityIndex, cityIndex2);

            return resultCity;

        }

        //String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";

        public static String getState(String address) {

            String resultState = " ";

            int stateIndex = address.lastIndexOf(',')+1;

            int stateIndex2 = address.lastIndexOf(' ');

            resultState = address.substring(stateIndex, stateIndex2);

            return resultState;
        }

        public static int getZipcode(String address) {
            String resultZipCode = " ";

            int zipCode = address.lastIndexOf( ' ')+1;

            resultZipCode = address.substring(zipCode);

            return Integer.valueOf(resultZipCode);
        }
    }


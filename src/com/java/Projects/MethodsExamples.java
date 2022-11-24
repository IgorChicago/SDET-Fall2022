package com.java.Projects;

public class MethodsExamples {

    public static void main(String[] args) {
        String str1 = "Hello, my name is Viktoriia!";
        String str2 = " But you can call me Vi.";
        String str3 = "Hello, my name is VIKTOR!";
        charAt(str1);
        concat(str1, str2);
        contains(str1, "name");
        compareTo(str1, str3);
        compareTo(str1, str1);
        equals(str1, str3);
        equals(str1, str1);
        endsStartsWith(str1, "!");
        String[] strings = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] numbers = {40, 50, 75, 0, 150, 60, 230};
        format(strings, numbers);
        indexOf(str1);
        lengthM(str1);
        isEmpty(str2);
        matches("chocolate");//'crocodile'
        String str4 = "Today IS 23-!-11-!-2022. It is a day of my student mentoring session!";
        replace(str4);
        split(str2);
        substring(str3);
        String str5 = "        Let's do some coding!                    ";
        trim(str5);
        toCharArray(str1);
        toCase(str2);
        join();

    }

    public static void charAt(String str) {
        int index = 10;
        System.out.println("Character at position " + index + ": " + str.charAt(index));
    }

    public static void concat(String str, String str2) {
        String newString = str.concat(str2);
        System.out.println("\nConcatenation of two strings: " + newString);
    }

    public static void contains(String str, String str2) {
        boolean ifContains = str.contains(str2);
        System.out.println("\nGiven string contains sequence '" + str2 + "': " + ifContains);
    }

    public static void compareTo(String str, String str2) {
        int comparing = str.compareTo(str2);
        System.out.println("\nComparing two strings: " + comparing);
        int comparingIC = str.compareToIgnoreCase(str2);
        System.out.println("Comparing two strings (ignoring case): " + comparingIC);
    }

    public static void equals(String str, String str2) {
        boolean equals = str.equals(str2);
        System.out.println("\nTwo strings are equal: " + equals);
        boolean equalsIC = str.equalsIgnoreCase(str2);
        System.out.println("Two strings are equal: " + equalsIC);
    }

    public static void endsStartsWith(String str, String str2) {
        boolean ends = str.endsWith(str2);
        System.out.println("\nString ends with '" + str2 + "': " + ends);
        boolean starts = str.startsWith(str2);
        System.out.println("String starts with '" + str2 + "': " + starts);
    }

    public static void format(String[] str, int[] d) {
        System.out.println("\n================================");
        for (int i = 0; i < str.length; i++) {
            System.out.printf("%-12s %04d\n", str[i], d[i]);
        }
        System.out.println("================================");
    }

    public static void indexOf(String str) {
        char c = 'e';
        int index = str.indexOf(c);
        System.out.println("\nIndex of \"" + c + "\": " + index);
        int indexLast = str.lastIndexOf(c);
        System.out.println("Last index of \"" + c + "\": " + indexLast);
    }

    public static void lengthM(String str) {
        System.out.println("\nThe length of the given string is " + str.length());
    }

    public static void isEmpty(String str) {
        boolean isit = str.isEmpty();
        System.out.println("\nThe given string is empty: " + isit);
    }

    public static void matches(String str) {
        boolean m1 = str.matches("\\D{9}");
        boolean m2 = str.matches("(.*)te");
        boolean m3 = str.matches("^c.......e");
        System.out.println("Does '" + str + "' match 10-letter word?: " + m1);
        System.out.println("Does '" + str + "' match word that ends with 'te'?: " + m2);
        System.out.println("Does '" + str + "' match word that starts with 'c' & ends with 'e'?: " + m3);
    }

    public static void replace(String str) {
        String newstr = str.replace('o', '0');
        String newstr2 = str.replaceAll("-!-", "/");
        //(?i) to ignore case
        String newstr3 = str.replaceFirst("(?is)is", "Are");
        System.out.println("\nString using replace: " + newstr);
        System.out.println("String using replaceAll: " + newstr2);
        System.out.println("String using replaceFirst: " + newstr3);
    }

    public static void split(String str) {
        //can add the limit of splitting
        String[] newstr = str.split(" ");
        for (String el : newstr) {
            System.out.println(el);
        }
    }

    public static void substring(String str) {
        String sub = str.substring(4, 14);
        System.out.println("\nSubstring: " + sub);
    }

    public static void trim(String str) {
        String newstr = str.trim();
        System.out.println("\nTrimmed string: " + newstr);
    }

    public static void toCharArray(String str) {
        char[] arrayFromString = str.toCharArray();
        System.out.println("\nChar array from string:");
    //    System.out.println(Array.toString(arrayFromString));
        for(int i=0; i<str.length();i++){
        System.out.print(arrayFromString[i]+" ");
       }

    }

    public static void toCase(String str) {
        String toupper = str.toUpperCase();
        String tolower = str.toLowerCase();
        System.out.println("\nTo uppercase: " + toupper);
        System.out.println("To lowercase: " + tolower);
    }

    public static void join() {
        String joined = String.join("-!-", "1", "2", "ght", "4", "5");
        System.out.println("\nResult of join = " + joined);
    }
}



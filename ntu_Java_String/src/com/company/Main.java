package com.company;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
//        The static method String.format() (introduced in JDK 5) can be used to produce
//        a formatted String using C-like printf()'s format specifiers.
//        The format() method has the same form as printf().
        // write your code here
        System.out.println(String.format("%.1f", 1.234));

        System.out.printf("%.2f", 5.678);

        /* 2.1  String Literal vs. String Object */
        String s1 = "Hello";              // String literal
        String s2 = "Hello";              // String literal
        String s3 = s1;                   // same reference
        String s4 = new String("Hello");  // String object
        String s5 = new String("Hello");  // String object

        System.out.println(s1 == s1);   // true, same pointer
        System.out.println(s1 == s2);   // true, s1 and s1 share storage in common pool
        System.out.println(s1 == s3);   // true, s3 is assigned same pointer as s1
        System.out.println(s1.equals(s3));   // true, same contents
        System.out.println(s1 == s4);   // false, different pointers
        System.out.println(s1.equals(s4));   // true, same contents
        System.out.println(s4 == s5);   // false, different pointers in heap
        System.out.println(s4.equals(s5));   // true, same contents

        /* 3.1  java.lang.StringBuffer */
        // To create a string from parts, It is more efficient to use StringBuffer (multi-thread)
        // or StringBuilder (single-thread) instead of via String concatenation.

        // Create a string of YYYY-MM-DD HH:MM:SS
        int year = 2010, month = 10, day = 10;
        int hour = 10, minute = 10, second = 10;
        String dateStr = new StringBuilder()
                .append(year).append("-").append(month).append("-").append(day).append(" ")
                .append(hour).append(":").append(minute).append(":").append(second).toString();
        System.out.println(dateStr);

        // StringBuilder is more efficient than String concatenation
        /**
         * Reverse the words in a String using StringTokenizer
         */
        String anotherDataStr = year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second;
        System.out.println(anotherDataStr);

        /* 4.  java.util.StringTokenizer (Obsoleted by regex) */
        String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        String strReverse;
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(str);

        while (stringTokenizer.hasMoreTokens()) {
            stringBuilder.insert(0, stringTokenizer.nextToken());
            if (stringTokenizer.hasMoreTokens()) {
                stringBuilder.insert(0, " ");
            }
        }

        strReverse = stringBuilder.toString();
        System.out.println(strReverse);

        /**
         * Reverse the words in a String using split() method of the String class
         */
        String[] tokens = str.split("\\s");  // white space '\s' as delimiter
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tokens.length; ++i) {
            sb.insert(0, tokens[i]);
            if (i < tokens.length - 1) {
                sb.insert(0, " ");
            }
        }
        String strReverse2 = sb.toString();
        System.out.println(strReverse2);

    }
}

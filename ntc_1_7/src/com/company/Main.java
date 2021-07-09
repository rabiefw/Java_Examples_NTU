package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n1.7  Ex: The Date Class:");

        // Test constructor and toString()
        System.out.println("\nTest constructor and toString():");
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1);  // toString()

        // Test Setters and Getters
        System.out.println("\nTest Setters and Getters:");
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);  // toString()
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());

        // Test setDate()
        System.out.println("\nTest setDate():");
        d1.setDate(3, 4, 2016);
        System.out.println(d1);  // toString()
    }
}

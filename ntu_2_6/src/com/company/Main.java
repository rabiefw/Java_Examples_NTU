package com.company;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n-> 2.6  Ex: The MyPoint Class:");
        // Test constructors and toString()
        System.out.println("\nTest constructors and toString():");
        MyPoint p1 = new MyPoint(1, 2);
        System.out.println(p1);  // toString()
        //(1,2)
        MyPoint p2 = new MyPoint();  // default constructor
        System.out.println(p2);
        //(0,0)

        // Test Setters and Getters
        System.out.println("\nTest Setters and Getters:");
        p1.setX(3);
        p1.setY(4);
        System.out.println(p1);  // run toString() to inspect the modified instance
        //(3,4)
        System.out.println("X is: " + p1.getX());
        //X is: 3
        System.out.println("Y is: " + p1.getY());
        //Y is: 4

        // Test setXY() and getXY()
        System.out.println("\nTest setXY() and getXY():");
        p1.setXY(5, 6);
        System.out.println(p1);  // toString()
        //(5,6)
        System.out.println("X is: " + p1.getXY()[0]);
        //X is: 5
        System.out.println("Y is: " + p1.getXY()[1]);
        //Y is: 6
        System.out.println("XY is: " + Arrays.toString(p1.getXY()));
        //XY is: [5, 6]

        // Test the 3 overloaded versions of distance()
        System.out.println("\nTest the 3 overloaded versions of distance():");
        p2.setXY(10, 11);
        System.out.printf("Distance is: %.2f%n", p1.distance(10, 11));
        //Distance is: 7.07
        System.out.printf("Distance is: %.2f%n", p1.distance(p2));
        //Distance is: 7.07
        System.out.printf("Distance is: %.2f%n", p2.distance(p1));
        //Distance is: 7.07
        System.out.printf("Distance is: %.2f%n", p1.distance());
        //Distance is: 7.81

        //Write a program that allocates 10 points in an array of MyPoint, and initializes to (1, 1), (2, 2), ... (10, 10).
        System.out.println("\nA program that allocates 10 points in an array of MyPoint:");
        MyPoint[] myPoints = new MyPoint[10];
        for (int i = 0; i < myPoints.length; i++) {
            myPoints[i] = new MyPoint(i + 1, i + 1);
        }
        for (int i = 0; i < myPoints.length; i++) {
            System.out.println(myPoints[i]);
        }

    }
}

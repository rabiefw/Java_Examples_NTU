package com.company;

import java.util.Arrays;
/**
 * A Test Driver for the Line class.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n-> 2.7  Ex: The MyLine and MyPoint Classes:");
        // Test constructor and toString()
        System.out.println("\nTest constructor and toString():");
        MyLine l1 = new MyLine(1, 2, 3, 4);
        System.out.println(l1);  // Line's toString()
        //Line[begin=(1,2),end=(3,4)]
        MyLine l2 = new MyLine(new MyPoint(5,6), new MyPoint(7,8));  // anonymous Point's instances
        System.out.println(l2);  // Line's toString()
        //Line[begin=(5,6),end=(7,8)]

        // Test Setters and Getters
        System.out.println("\nTest Setters and Getters:");
        l1.setBegin(new MyPoint(11, 12));
        l1.setEnd(new MyPoint(13, 14));
        System.out.println(l1);  // Line's toString()
        //Line[begin=(11,12),end=(13,14)]
        System.out.println("begin is: " + l1.getBegin());  // Point's toString()
        //begin is: (11,12)
        System.out.println("end is: " + l1.getEnd());  // Point's toString()
        //end is: (13,14)

        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);  // Line's toString()
        //Line[begin=(21,22),end=(23,24)]
        System.out.println("begin's x is: " + l1.getBeginX());
        //begin's x is: 21
        System.out.println("begin's y is: " + l1.getBeginY());
        //begin's y is: 22
        System.out.println("end's x is: " + l1.getEndX());
        //end's x is: 23
        System.out.println("end's y is: " + l1.getEndY());
        //end's y is: 24

        l1.setBeginXY(31, 32);
        l1.setEndXY(33, 34);
        System.out.println(l1);  // Line's toString()
        //Line[begin=(31,32),end=(33,34)]
        System.out.println("begin's x and y are: " + Arrays.toString(l1.getBeginXY()));
        //begin's x and y are: [31, 32]
        System.out.println("end's x and y are: " + Arrays.toString(l1.getEndXY()));
        //end's x and y are: [33, 34]

        // Test getLength()
        System.out.println("\nTest getLength():");
        System.out.printf("length is: %.2f%n", l1.getLength());
        //length is: 2.83
    }
}

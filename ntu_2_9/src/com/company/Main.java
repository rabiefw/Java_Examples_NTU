package com.company;


/**
 * A Test Driver for the MyTriangle class.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n-> 2.8  Ex: The MyTriangle and MyPoint Classes:");
        // Test Constructors and toString()
        System.out.println("\nTest Constructors and toString():");
        MyTriangle t1 = new MyTriangle(new MyPoint(0, 5), new MyPoint(5, 0), new MyPoint( 0, 0));
        System.out.println(t1);  // Triangle's toString()
        MyTriangle t2 = new MyTriangle(1, 2, 3, 4, 5, 14);
        System.out.println(t2);  // Triangle's toString()

        System.out.println(t1);  // Triangle's toString()
        System.out.println(t2);  // Triangle's toString()

        System.out.println("Triangle 1's type is: " + t1.getType());
        System.out.println("Triangle 1's Perimeter is: " + t1.getPerimeter());

        System.out.println("Triangle 2's type is: " + t2.getType());
        System.out.println("Triangle 2's Perimeter  is: " + t2.getPerimeter());

    }
}

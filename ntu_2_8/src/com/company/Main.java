package com.company;


/**
 * A Test Driver for the MyCircle class.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n-> 2.8  Ex: The MyCircle and MyPoint Classes:");
        // Test Constructors and toString()
        System.out.println("\nTest Constructors and toString():");
        MyCircle c1 = new MyCircle();
        System.out.println(c1);  // Circle's toString()
        MyCircle c2 = new MyCircle(1, 2, 3);
        System.out.println(c2);  // Circle's toString()
        MyCircle c3 = new MyCircle(new MyPoint(4, 5), 6);   // an anonymous Point instance
        System.out.println(c3);  // Circle's toString()

        // Test Setters and Getters
        System.out.println("\nTest Setters and Getters:");
        c1.setCenter(new MyPoint(11, 12));
        c1.setRadius(13);
        System.out.println(c1);  // Circle's toString()
        System.out.println("center is: " + c1.getCenter());  // Point's toString()
        System.out.println("radius is: " + c1.getRadius());

        c1.setCenterX(21);
        c1.setCenterY(22);
        System.out.println(c1);  // Circle's toString()
        System.out.println("center's x is: " + c1.getCenterX());
        System.out.println("center's y is: " + c1.getCenterY());
        c1.setCenterXY(31, 32);
        System.out.println(c1);  // Circle's toString()
        System.out.println("center's x is: " + c1.getCenterXY()[0]);
        System.out.println("center's y is: " + c1.getCenterXY()[1]);

        // Test getArea() and getCircumference()
        System.out.println("\nTest getArea() and getCircumference():");
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());

        // Test distance()
        System.out.println("\nTest distance():");
        System.out.printf("distance is: %.2f%n", c1.distance(c2));
        System.out.printf("distance is: %.2f%n", c2.distance(c1));
    }
}

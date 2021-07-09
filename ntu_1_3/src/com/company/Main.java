package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n1.3  Ex: The Rectangle Class");
        // Test constructors and toString()
        // You need to append a 'f' or 'F' to a float literal
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);  // toString()
        Rectangle r2 = new Rectangle();  // default constructor
        System.out.println(r2);

        // Test setters and getters
        System.out.println("\nTest setters and getters:");
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);  // toString()
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.println("\nTest getArea() and getPerimeter():");
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}

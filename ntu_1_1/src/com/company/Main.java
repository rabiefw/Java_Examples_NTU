package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("\n\n1.1  An Introduction to Classes and Instances by Example - The Circle Class:");
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle circle1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("Circle with default constructor has Radius " + circle1.getRadius() + " & Area " + circle1.getArea());

        // Declare an instance of class circle1 called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle circle2 = new Circle(5);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("Circle with custom constructor has Radius " + circle2.getRadius() + " & Area " + circle2.getArea());

        Circle circle3 = new Circle();
        System.out.println("Radius before set is: " + circle3.getRadius());
        circle3.setRadius(6);
        System.out.println("Radius after set is: " + circle3.getRadius());

        Circle circle4 = new Circle(3);
        circle4.setColor("BLUE");
        System.out.println("Circle 4 using toString explicitly:\n" + circle4.toString());
        System.out.println("Circle 4 using toString imlicitly: ");
        System.out.println(circle4);

        System.out.println("\n\n1.2  Ex: Yet Another Circle Class: ");
        // Test Constructors and toString()
        Circle c1 = new Circle(1.1);
        System.out.println(c1);   // toString()
        Circle c2 = new Circle(); // default constructor
        System.out.println(c2);

        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1);      // toString()
        System.out.println("radius is: " + c1.getRadius());

        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}

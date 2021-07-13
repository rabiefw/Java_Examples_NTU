package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n->4.5  Ex: Superclass Shape and its subclasses Circle, Rectangle and Square");
        System.out.println("\nTesting subclass Circle:");
        Circle circle = new Circle("BLUE", false, 2.4f);
        System.out.println(circle);
        System.out.println("Area is: " + circle.getArea() + " & Perimeter: " + circle.getPerimeter());

        System.out.println("\nTesting subclass Rectangle:");
        Rectangle rectangle = new Rectangle("White", true, 5 , 6);
        System.out.println(rectangle);
        System.out.println("Area is: " + rectangle.getArea() + " & Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nTesting subclass Rectangle:");
        Square square = new Square(5, "Yellow", true);
        System.out.println(square);
        System.out.println("Area is: " + square.getArea() + " & Perimeter: " + square.getPerimeter());
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n->6.5  Ex: Interfaces Resizable and GeometricObject");
        System.out.println("\nTesting Circle Class which implements Geometric Object:");
        GeometricObject circle = new Circle(2.3);
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea() + " Perimeter: " + circle.getPerimeter());


        System.out.println("\nTesting Circle Class which implements Resizable & extends Circle:");
        ResizableCircle resizableCircle = new ResizableCircle(1.5);
        System.out.println(resizableCircle);
        System.out.println("Circle Area: " + resizableCircle.getArea() + " Perimeter: " + resizableCircle.getPerimeter());
        resizableCircle.resize(90);
        System.out.println(resizableCircle);
        System.out.println("After resize: Circle Area: " + resizableCircle.getArea() + " Perimeter: " + resizableCircle.getPerimeter());


    }
}

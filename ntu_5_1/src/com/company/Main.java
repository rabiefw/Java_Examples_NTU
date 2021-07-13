package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n->5.1  Ex: The Point and Line Classes:");
        System.out.println("\nTesting Point class:");
        Point p1 = new Point(10, 20);   // Construct a Point
        System.out.println(p1);
        // Try setting p1 to (100, 10).
        p1.setXY(100, 10);
        System.out.println("New p1 setup: " + p1);

        System.out.println("\nTesting Line (using composition) class:");
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("Line Length is: " + l1.getLength());
        System.out.println("Line Gradient is: " + l1.getGradient());

        System.out.println("\nTesting LineSub inherited subclass:");
        LineSub lineSub = new LineSub(3 , 4, 6, 8);
        System.out.println(lineSub);
        System.out.println("Testing getBegin method which uses superclass: " + lineSub.getBegin());
        System.out.println("SubLine Length is: " + lineSub.getLength());
        System.out.println("SubLine Gradient is: " + lineSub.getGradient());
    }
}

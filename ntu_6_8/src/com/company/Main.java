package com.company;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n-> 6.8  Ex: Interface Movable and its implementation subclasses MovablePoint and MovableCircle:");
        System.out.println("\nTesting MovablePoint:");
        Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        System.out.println("\nTesting MovableCircle:");
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        System.out.println("\nTesting MovableRectangle:");
        Movable m3 = new MovableRectangle(1,2,3,4,5,6); // upcast
        System.out.println(m3);
        m3.moveRight();
        System.out.println(m3);

    }
}
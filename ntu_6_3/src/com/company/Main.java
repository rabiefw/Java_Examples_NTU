package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n6.3  Ex: Movable Interface and its Implementation MovablePoint Class:");
        System.out.println("\nUpcast MovablePoint to Movable:");
        Movable movablePoint1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(movablePoint1);
        movablePoint1.moveDown();
        movablePoint1.moveRight();
        System.out.println("After moving Down & Right:");
        System.out.println(movablePoint1);

        System.out.println("\nDowncast MovablePoint to MovablePoint:");
        MovablePoint movablePoint2 = new MovablePoint(6, 5, 4, 2);
        System.out.println(movablePoint2);
        movablePoint2.moveUp();
        movablePoint2.moveLeft();
        System.out.println("After moving Up & Left:");
        System.out.println(movablePoint2);

        System.out.println("\n\n6.4  Ex: Movable Interface and its Implementation Classes MovablePoint and MovableCircle:");
        System.out.println("\nUpcast movableCircle1 to Movable:");
        Movable movableCircle1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(movableCircle1);
        movableCircle1.moveDown();
        movableCircle1.moveRight();
        System.out.println("After moving Down & Right:");
        System.out.println(movableCircle1);

        System.out.println("\nDowncast movableCircle2 to movableCircle2:");
        MovableCircle movableCircle2 = new MovableCircle(6, 5, 4, 2, 7);
        System.out.println(movableCircle2);
        movableCircle2.moveUp();
        movableCircle2.moveLeft();
        System.out.println("After moving Up & Left:");
        System.out.println(movableCircle2);
    }
}

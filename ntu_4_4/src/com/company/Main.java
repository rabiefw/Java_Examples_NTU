package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n-> 4.4  Ex: Point and MovablePoint");
        System.out.println("\n Testing MovablePoint Class");
        MovablePoint movablePoint = new MovablePoint(5,6, 11.5f, 13.53f);
        System.out.println(movablePoint);

        System.out.println("\nGetting XY speed");
        float[] resultXY = new float[2];
        resultXY = movablePoint.getSpeed();
        System.out.println(resultXY[0] + "," + resultXY[1]);

        System.out.println("\nSetting XY & XY speed");
        movablePoint.setXY(11,234);
        movablePoint.setSpeed(33.43f,311);
        System.out.println(movablePoint);

        System.out.println("\nUsing move method:");
        movablePoint.move();
        System.out.println(movablePoint);
    }
}

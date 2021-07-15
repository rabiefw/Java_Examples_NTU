package com.company;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public double moveUp() {
        return y -= ySpeed;
    }

    @Override
    public double moveDown() {
        return y += ySpeed;
    }

    @Override
    public double moveLeft() {
        return x -= xSpeed;
    }

    @Override
    public double moveRight() {
        return x += xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "(x=" + x +
                ", y=" + y +
                "), Speed=(" + xSpeed + ',' +
                ySpeed +
                ")}";
    }
}

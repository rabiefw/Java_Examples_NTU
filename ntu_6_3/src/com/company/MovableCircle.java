package com.company;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }


    @Override
    public double moveUp() {
        return center.y -= center.ySpeed;
    }

    @Override
    public double moveDown() {
        return center.y += center.ySpeed;
    }

    @Override
    public double moveLeft() {
        return center.x -= center.xSpeed;
    }

    @Override
    public double moveRight() {
        return center.x += center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}

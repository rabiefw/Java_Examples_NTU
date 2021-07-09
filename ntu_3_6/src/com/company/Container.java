package com.company;

public class Container {
    private int x1, x2, y1, y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width - 1;
        this.y2 = y1 + height - 1;
    }


    @Override
    public String toString() {
        return "Container{" +
                "(" + x1 +
                "," + x2 + ")" +
                "," + y1 +
                "," + y2 + ")" +
                '}';
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getWidth() {
        return x2 - x1 + 1;
    }

    public int getHeight() {
        return y2 - y1 + 1;
    }

    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 ||
                ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        if (ball.getY() - ball.getRadius() <= this.y1 ||
                ball.getY() + ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            return true;
        }

        return false;
    }
}

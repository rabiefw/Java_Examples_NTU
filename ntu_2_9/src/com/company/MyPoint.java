package com.company;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;

        return results;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint(" + x +
                "," + y +
                ")";
    }

    /** Return the distance from this instance to the given point at (x,y). Invoke via p1.distance(1,2) */
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    /** Returns the distance from this instance to the given Point instance. Invoke via p1.distance(p2) */
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    /** Returns the distance from this instance to (0,0). Invoke via p1.distance() */
    public double distance() {
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}

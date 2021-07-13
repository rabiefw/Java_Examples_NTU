package com.company;

public class Point {
    private float x = 0;
    private float y = 0;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] results = new float[2];
        results[0] = this.x;
        results[1] = this.y;

        return results;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + x +
                "," + y +
                ")";
    }

    /**
     * Return the distance from this instance to the given point at (x,y). Invoke via p1.distance(1,2)
     */
    public double distance(float x, float y) {
        float xDiff = this.x - x;
        float yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Returns the distance from this instance to the given Point instance. Invoke via p1.distance(p2)
     */
    public double distance(Point another) {
        float xDiff = this.x - another.x;
        float yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Returns the distance from this instance to (0,0). Invoke via p1.distance()
     */
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}

package com.company;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "subclass of " + super.toString() +
                "height=" + height +
                '}';
    }
}

package com.company;

public class Cylinder {
    private double height = 1.0;
    private Circle base;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public String getColor() {
        return base.getColor();
    }

    public double getRadius() {
        return base.getRadius();
    }

    public double getBaseArea() {
        return base.getArea();
    }

    public double getSurfaceArea() {
        return 2 * base.getArea() + 2 * Math.PI * base.getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "subclass of " + base.toString() +
                "height=" + height +
                '}';
    }

}

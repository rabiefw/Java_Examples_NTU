package com.company;

/**
 * The Circle class models a circle with a radius and color.
 */

public class Circle {
    private double radius;
    private String color;

    // Constructors (overloaded)

    /**
     * Constructs a Circle instance with default value for radius and color
     */
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    /**
     * Constructs a Circle instance with the given radius and default color
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Returns the area of this Circle instance
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Returns the circumference of this Circle instance
     * @return circumference
     */
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    // Setter for instance variable radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Setter for instance variable color
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?]
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

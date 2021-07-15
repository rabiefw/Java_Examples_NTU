package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n-> Ex: The Circle and Cylinder Classes Using Composition:");
        // Declare and allocate a new instance of cylinder
        //   with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + "color=" + c1.getColor()
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getBaseArea()
                + " volume=" + c1.getVolume());

        // Declare and allocate a new instance of cylinder
        //   specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + "color=" + c2.getColor()
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getBaseArea()
                + " volume=" + c2.getVolume());

        // Declare and allocate a new instance of cylinder
        //   specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, "BLUE", 10);
        System.out.println("Cylinder:"
                + " color=" + c3.getColor()
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getBaseArea()
                + " volume=" + c3.getVolume()
                + " surface area= " +  c3.getSurfaceArea());

        System.out.println(c3);
    }
}

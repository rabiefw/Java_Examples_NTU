package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("\n\n->6.2  Ex: GeometricObject Interface and its Implementation Classes Circle and Rectangle:");
        System.out.println("\nImplementing Rectangle using GeometricObject Interface: ");
        GeometricObject s1 = new Rectangle(1, 2);  // upcast
        System.out.println(s1);
        //Rectangle[length=1,width=2]
        System.out.println("Rectangle Area is " + s1.getArea());
        //Area is 2.0

        System.out.println("\nImplementing Circle using GeometricObject Interface: ");
        GeometricObject s2 = new Circle(3);  // upcast
        System.out.println(s2);
        System.out.println("Circle Area is " + s2.getArea());
    }
}

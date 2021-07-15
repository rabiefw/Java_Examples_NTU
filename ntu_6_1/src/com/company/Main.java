package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n->6.1  Ex: Abstract Superclass Shape and Its Concrete Subclasses");
        System.out.println("\nUpcast Circle to Shape:");
        Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.getFilled());
//        System.out.println(s1.getRadius());

        System.out.println("\nDowncast back to Circle:");
        Circle c1 = (Circle) s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.getFilled());
        System.out.println(c1.getRadius());

//        Shape s2 = new Shape();   // Cannot create instance of an abstract class
                                    //compilation error: Shape is abstract; cannot be instantiated

        System.out.println("\nUpcast Rectangle to Shape:");
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
//        System.out.println(s3.getHeight());

        System.out.println("\ndowncast Shape s3 to Rectangle:");
        Rectangle r1 = (Rectangle) s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getHeight());

        System.out.println("\nUpcast Square to Shape:");
        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide());

        System.out.println("\ndowncast Shape s4 to Rectangle:");
        // Take note that we downcast Shape s4 to Rectangle,
        //  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide());
        System.out.println(r2.getHeight());

        // Downcast Rectangle r2 to Square
        System.out.println("\nDowncast Rectangle r2 to Square:");
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getHeight());
    }
}

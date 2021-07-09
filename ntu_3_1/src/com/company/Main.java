package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n-> 3.1  Ex: The MyComplex class:");

        // Test constructor and toString()
        System.out.println("\n\n-> 3.1  Ex: The MyComplex class:");
        MyComplex myComplex1 = new MyComplex();
        MyComplex myComplex2 = new MyComplex(1,4);
        System.out.println(myComplex1);
        System.out.println(myComplex2);

        // Test Setters and Getters
        System.out.println("\nTest Setters and Getters:");
        myComplex1.setReal(3);
        myComplex1.setImag(-12);
        System.out.println("myComplex1 after set, using getters:" + myComplex1.getReal() + "+" + myComplex1.getImag() + "i");
        myComplex2.setValue(2,0);
        System.out.println("myComplex2 after set, using getters:" + myComplex2.getReal() + "+" + myComplex2.getImag() + "i");

        // Test Methods
        System.out.println("\nTest Methods:");
        System.out.println("Testing isReal(): " + myComplex2.isReal());
        System.out.println("\nTesting isImaginary(): " + myComplex1.isImaginary());
        System.out.println("\nTesting equals()1: " + myComplex1.equals(3, 6));
        MyComplex myComplex3 = new MyComplex(2 , 0);
        System.out.println("\nTesting equals()2: " + myComplex2.equals(myComplex3));
        System.out.println("\nTesting magnitude(): " + myComplex1.magnitude());


        MyComplex myComplex4 = new MyComplex(4, 7);
        System.out.println("\nTesting addInto: " + myComplex1.addInto(myComplex3));
        System.out.println("\nTesting addNew: " + myComplex1.addNew(myComplex4));

    }
}

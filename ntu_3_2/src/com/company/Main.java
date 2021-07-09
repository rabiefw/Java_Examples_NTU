package com.company;

public class Main {

    public static void main(String[] args) {
        // Test program
        // Can invoke with a variable number of arguments
        MyPolynomial p1 = new MyPolynomial(-7, 5, -2);
        System.out.println(p1);
        System.out.println(p1.evaluate(3));
    }
}

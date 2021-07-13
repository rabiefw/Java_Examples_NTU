package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n->4.6  Ex: Superclass Animal and its subclasses");
        System.out.println("\nTesting Mammal Class:");
        Mammal mammal = new Mammal("Giraffe");
        System.out.println(mammal);

        System.out.println("\nTesting Cat Class:");
        Cat cat = new Cat("Lucy");
        System.out.println(cat);

        System.out.println("\nTesting Dog Class:");
        Dog dog1 = new Dog("Ace");
        dog1.greets();
        Dog dog2 = new Dog("Jacky");
        dog1.greets(dog2);
        System.out.println(dog1);
        System.out.println(dog2);

    }
}

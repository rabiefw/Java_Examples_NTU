package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n-> 6.6  Ex: Abstract Superclass Animal and its Implementation Subclasses:");
        System.out.println("Testing Cat method which extends Animal using Animal class as reference");
        Animal cat1 = new Cat("Jake");
        cat1.greets();


        System.out.println("Testing Cat method which extends Animal using Cat class as reference");
        Cat cat2 = new Cat("Jake");
        cat2.greets();

        System.out.println("Testing Dog method which extends Animal using Animal class as reference");
        Animal dog1 = new Dog("Jake");
        dog1.greets();


        System.out.println("Testing Dog method which extends Animal using Dog class as reference");
        Dog dog2 = new Dog("Jake");
        dog2.greets();
        dog2.greets(dog2);

        System.out.println("Testing BigDog method which extends Dog using Dog class as reference");
        Dog bigDog1 = new BigDog("Jake");
        bigDog1.greets();
        bigDog1.greets(dog2);

        System.out.println("Testing BigDog method which extends Animal using BigDog class as reference");
        BigDog bigDog2 = new BigDog("Jake");
        bigDog2.greets();
        bigDog2.greets(bigDog1);

        System.out.println("Testing BigDog method which extends Animal using Animal class as reference");
        Animal bigDog3 = new BigDog("Huge");
        bigDog3.greets();
//        bigDog3.greets(bigDog1);  // Error: the reference is the abstract method in Animal which does not have bigDog input

    }
}

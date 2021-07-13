package com.company;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets(){
        System.out.println("This dog says: Woof");
    }

    public void greets(Dog another){
        System.out.println("Another Dog says: Woooooooof");
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}

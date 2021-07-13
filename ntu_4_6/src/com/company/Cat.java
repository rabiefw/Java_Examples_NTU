package com.company;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{} " + super.toString();
    }

    public void greets(){
        System.out.println("Cat says Meow");
    }
}

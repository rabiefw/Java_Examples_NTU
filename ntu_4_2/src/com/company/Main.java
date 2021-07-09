package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n->4.2  Ex: Superclass Person and its subclasses");
        System.out.println("\nTesting student subclass");
        Student student = new Student("RAB", "MIL", "MATH", 2020, 202);
        System.out.println(student);

        System.out.println("\nTesting staff subclass");
        Staff staff = new Staff("Claudio", "Legnano", "POLIMI", 1234);
        System.out.println(staff);
    }
}

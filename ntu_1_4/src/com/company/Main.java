package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n1.4  Ex: The Employee Class");

        // Test constructor and toString()
        System.out.println("\nTest constructor and toString()");
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);  // toString();

        // Test Setters and Getters
        System.out.println("\nTest Setters and Getters");
        e1.setSalary(999);
        System.out.println(e1);  // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println("\nTest raiseSalary()");
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }

}

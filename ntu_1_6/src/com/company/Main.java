package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n1.6  Ex: The Account Class:");

        // Test constructor and toString()
        System.out.println("\nTest constructor and toString():");
        Account a1 = new Account("A101", "Tan Ah Tick", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("\nTest Getters:");
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        System.out.println("\nTest credit() and debit():");
        a1.credit(100).credit(500);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        System.out.println("\nTest transfer():");
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);
    }
}

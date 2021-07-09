package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n1.5  Ex: The InvoiceItem Class:");

        // Test constructor and toString()
        System.out.println("\nTest constructor and toString():");
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);  // toString();

        // Test Setters and Getters
        System.out.println("\nTest Setters and Getters:");
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);  // toString();
        System.out.println("id is: " + inv1.getID());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        // Test getTotal()
        System.out.println("\nTest getTotal():");
        System.out.println("The total is: " + inv1.getTotal());
    }
}

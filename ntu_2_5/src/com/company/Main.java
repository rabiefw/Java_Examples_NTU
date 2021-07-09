package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n-> 2.5  Ex: The Customer and Account classes:");

        // Test Customer class
        Customer c1 = new Customer(12,"Rab", 'm');
        System.out.println(c1);  // Customer's toString()

        System.out.println(c1);
        System.out.println("id is: " + c1.getID());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());


        // Test Invoice class
        Account account = new Account(101, c1, 888.8);
        System.out.println(account);

        account.setBalance(999.9);
        System.out.println(account);
        System.out.println("id is: " + account.getId());
        System.out.println("customer is: " + account.getCustomer());  // Customer's toString()
        System.out.println("balance is: " + account.getBalance());
        System.out.println("customer's id is: " + account.getId());
        System.out.println("customer's name is: " + account.getCustomerName());
        System.out.println("Depositing: " + account.deposit(1566));
        System.out.println("withdraw:" + account.withdraw(100));

    }
}

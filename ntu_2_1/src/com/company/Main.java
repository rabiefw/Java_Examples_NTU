package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n2.1  An Introduction to OOP Composition by Example - the Author and Book Classes:");

        System.out.println("\n-> Testing Author class:");
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck);  // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name is: " + ahTeck.getName());     // Test getter
        System.out.println("email is: " + ahTeck.getEmail());   // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test gExerciseOOP_MyPolynomial.pngetter

        System.out.println("\n-> Testing Book class:");
        // Construct an author instance
        Author rabi = new Author("Rabi Motta", "rabi@nowhere.com", 'm');
        System.out.println(rabi);  // Author's toString()

        Book dummyBook = new Book("Java for dummy", rabi, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters
        System.out.println("\n-> Test Getters and Setters:");
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        System.out.println("\n-> Use an anonymous instance of Author to construct a Book instance:");
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()
        System.out.println("Author's email is: " + anotherBook.getAuthor().getEmail());
        System.out.println("Using getAuthorEmail() , Author's email is: " + anotherBook.getAuthorEmail());
        System.out.println("Using getAuthorName(), Author's name is: " + anotherBook.getAuthorName());
        System.out.println("Using getAuthorGender(), Author's gender is: " + anotherBook.getAuthorGender());


    }
}

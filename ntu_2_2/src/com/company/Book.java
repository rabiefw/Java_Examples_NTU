package com.company;

import java.util.Arrays;
import java.util.StringJoiner;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    private String AuthorName = "";

    public String getAuthorNames(){
//        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter
//            for(Author strTemp: authors){
//                joinNames.add(strTemp.getName());
//            }
//            return String.valueOf(joinNames);
        for(Author strTemp: authors){
            AuthorName += strTemp.getName() + ",";
        }
        return AuthorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}

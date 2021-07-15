package com.company;

import java.security.PrivateKey;
import java.util.Date;
import java.util.PrimitiveIterator;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;

        System.out.println("Visit Constructor initialized class");
        System.out.println(customer.getName());
        // display time and date using toString()
        System.out.println(date.toString());
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        if (customer.isMember()) {
            return serviceExpense;
        }
        else{
            return serviceExpense - DiscountRate.getServiceDiscountRate(customer.getMemberType()) * serviceExpense;
        }
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        if (customer.isMember()) {
            return productExpense;
        }
        else{
            return productExpense - DiscountRate.getProductDiscountRate(customer.getMemberType()) * productExpense;
        }
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return getProductExpense() + getServiceExpense();
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}

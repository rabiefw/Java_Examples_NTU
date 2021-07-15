package com.company;

public class DiscountRate {
    static private final double serviceDiscountPremium = 0.2;
    static private final double serviceDiscountGold = 0.15;
    static private final double serviceDiscountSilver = 0.1;

    static private final double productDiscountPremium = 0.1;
    static private final double productDiscountGold = 0.1;
    static private final double productDiscountSilver = 0.1;
    static private final int noDiscount = 0;


    static public double getServiceDiscountRate(String type) {
        return switch (type) {
            case "Premium" -> serviceDiscountPremium;
            case "Gold" -> serviceDiscountGold;
            case "Silver" -> serviceDiscountSilver;
            default -> noDiscount;
        };
    }

    static public double getProductDiscountRate(String type){
        return switch (type) {
            case "Premium" -> productDiscountPremium;
            case "Gold" -> productDiscountGold;
            case "Silver" -> productDiscountSilver;
            default -> noDiscount;
        };
    }
}

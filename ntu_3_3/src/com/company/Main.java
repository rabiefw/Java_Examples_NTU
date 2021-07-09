package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\n\n->3.3  Ex: Using JDK's BigInteger Class:");
        BigInteger bigInteger1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger bigInteger2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
    }
}

package com.company;
/**
 * *** Warning ***
 * In order to build this you need to configure this file as the main build
 */

public class CardTest {
    /* 1.2  Example 2: Deck of Card */
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        System.out.println("Cards before Shuffle: ");
        deck.print();
        deck.shuffle();
        System.out.println("Cards after Shuffle: ");
        deck.print();
    }
}

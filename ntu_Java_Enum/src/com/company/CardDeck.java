package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 1.2  Example 2: Deck of Card */

public class CardDeck {
    List<Card> deck;

    CardDeck() {
        deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void print() {
        System.out.println(deck);
    }

    public void shuffle() {
        // use Collections' static method to shuffle the List in place
        Collections.shuffle(deck);
    }


}

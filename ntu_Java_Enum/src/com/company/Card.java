package com.company;

/* 1.2  Example 2: Deck of Card */

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return rank.ordinal() + 1; // 1 to 13
    }

    @Override
    public String toString() {
        return "Card{" +
                 suit +
                " - " + rank +
                '}';
    }
}

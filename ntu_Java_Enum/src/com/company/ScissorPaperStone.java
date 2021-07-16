package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/* 1.1  Example 1: Scissor-Paper-Stone */

/*
 * A game of scissor-paper-stone.
 */
public class ScissorPaperStone {

    public static void main(String[] args) {
        Random random = new Random();
        boolean gameOver = false;
        HandSign playerMove = HandSign.SCISSOR;
        HandSign computerMove;
        int numTrials = 0;
        int numComputerWon = 0, numPlayerWon = 0, numTie = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Let us begin...");

        while (!gameOver) {
            System.out.println("Scissor-Paper-Stone");

            // Player move
            // Use a do-while loop to handle invalid input
            boolean validInput;
            do {
                System.out.print("  Show me your sign (Enter s for scissor, p for paper, t for stone, q to quit): ");
                char inChar = in.next().toLowerCase().charAt(0);
                validInput = true;  // assume valid unless otherwise
                switch (inChar) {
                    case 'q':
                        gameOver = true;
                        break;
                    case 's':
                        playerMove = HandSign.SCISSOR;
                        break;
                    case 'p':
                        playerMove = HandSign.PAPER;
                        break;
                    case 't':
                        playerMove = HandSign.STONE;
                        break;
                    default:
                        System.out.println("  Invalid input, try again...");
                        validInput = false;
                }
            } while (!validInput);
            if (!gameOver) {

                // Computer Move
                // Generate a random int 0 to 2, which happens to corresponds to
                //  the ordinal of the elements of the enum
                int rand = random.nextInt(3); // random int between 0 & 2
                computerMove = HandSign.values()[rand]; // map enum to array
                System.out.println(" My sign is: " + computerMove);

                // Check result
                if (computerMove == playerMove) {
                    ++numTie;
                } else if (computerMove == HandSign.SCISSOR && playerMove == HandSign.PAPER) {
                    System.out.println("  Scissor cuts paper, I won!");
                    ++numComputerWon;
                } else if (computerMove == HandSign.PAPER && playerMove == HandSign.STONE) {
                    System.out.println("  Paper wraps stone, I won!");
                    ++numComputerWon;
                } else if (computerMove == HandSign.STONE && playerMove == HandSign.SCISSOR) {
                    System.out.println("  Stone breaks scissor, I won!");
                    ++numComputerWon;
                } else {
                    System.out.println("  You won!");
                    ++numPlayerWon;
                }
                numTrials++;
            }
        }

        // Print statistics
        System.out.println("\nNumber of trials: " + numTrials);
        System.out.printf("I won %d(%.2f%%). You won %d(%.2f%%).%n", numComputerWon,
                100.0*numComputerWon/numTrials, numPlayerWon, 100.0*numPlayerWon/numTrials);
        System.out.println("Bye! ");

        for (HandSign sign : HandSign.values()) {
            System.out.println(sign + ":" + sign.ordinal());
        }
        //SCISSOR:0
        //PAPER:1
        //STONE:2
    }
}

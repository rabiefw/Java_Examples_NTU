package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\n\n-> 3.6  Ex: Bouncing Balls - Ball and Container Classes: ");
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball); // manual check the position of the ball
        }
    }
}

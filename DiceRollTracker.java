// This program simulates the dice rolling and position tracking part of a snakes and ladders game.

import java.util.Scanner; // Scanner used to get user input

public class DiceRollTracker {

    int positionNumber = 0; // Integer variable used to track the position of the player on the board
    public static int rollDice(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args) {



    }

}


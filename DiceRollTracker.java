// This program simulates the dice rolling and position tracking part of a snakes and ladders game.

import java.util.Scanner; // Scanner used to get user input

public class DiceRollTracker {

    static int  positionNumber = 5; // Integer variable used to track the position of the player on the board
    static int rolledNumber;
    public static int rollDice() {
        rolledNumber = (int) ((Math.random() * 6) + 1);
        return rolledNumber;

    }
    public static void main(String[] args) {
        System.out.println("You rolled " + rollDice() + "!");
        System.out.println("Your Position Number is now " + (positionNumber + rolledNumber) + "!");
    }

}


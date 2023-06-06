// This program simulates the dice rolling and position tracking part of a snakes and ladders game.
// When over 100, will be in position: 100 - (positionNumber - 100)
// End condition is positionNumber == 100

import java.util.Scanner; // Scanner used to get user input

public class DiceRollTracker {

    static int  positionNumber = 0; // Integer variable used to track the position of the player on the board
    static int rolledNumber;
    public static int rollDice() {
        rolledNumber = (int) ((Math.random() * 6) + 1); // + 1 to ensure 6 is included (0.99*6 is rounded to 5 by int)
        return rolledNumber;

    }
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String answer;

        while (positionNumber < 100){

            if (positionNumber == 0){
                System.out.println("Welcome to the game! Roll the dice!");
                System.out.println("Type \"yes\" to roll!");
                answer = userInput.nextLine();
                if (answer.equals("yes")){

                } else {
                    System.out.println("You typed an invalid input!");
                    continue;
                }

            } else {
                System.out.println("Would you like to roll the dice again?");
                System.out.println("Type \"yes\" to roll, Type \" no\" to stop!");
                answer = userInput.nextLine();

                if (answer.equals("no")){
                    System.out.println("Your final position is " + positionNumber + "!");
                    System.exit(0);
                } else if (answer.equals("yes")){

                } else {
                    System.out.println("You typed an invalid input!");
                    continue;
                }
            }

            System.out.println("You rolled " + rollDice() + "!");
            positionNumber = positionNumber + rolledNumber;
            System.out.println("Your Position Number is now " + positionNumber + "!");

            if (positionNumber == 100){
                System.out.println("Congrats! You reached the end of the board!");

            } else if (positionNumber > 100){
                System.out.println("You went over 100! You'll be brought backwards accordingly");
                positionNumber = 100 - (positionNumber - 100);
                System.out.println("Your new position is " + positionNumber + "!");

            } else {

            }
        }
    }
}


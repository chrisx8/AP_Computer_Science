/*
This is a Hi-Lo guessing game with numbers.  The program picks a random number between 1-100 (inclusive), then keeps
asking the user to guess the number.  On each guess, user will be told if guess is correct. If not, user will be told
if the guess is too high or too low, and they're asked to guess again.
At the end of each game (by quitting or a correct guess), ask if user wants to play again.
Users can quit at any time during the game.
*/

import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        //Instantiate Random and Scanner
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        //Define variables
        boolean play = true;
        int randomNumber;
        int userInput;
        int playAgain;
        int guesses = 0;

        /*Main Game logic loop
        Exits when play flag is false
        */
        while (play) {
            /*Start the game
            Generate a random number 1-100
            */
            randomNumber = random.nextInt(100) + 1;
            //Prompt for input
            System.out.println("A random number (1-100) is generated! Guess what it is...");
            //Exiting instruction
            System.out.println("You can leave the game at any time by entering 0");
            //Collect and save user input
            userInput = scan.nextInt();
            //guesses +1
            guesses++;

            /*Validate Input
            When input < 1 or > 100, ask for another input without adding guesses
            */
            while (userInput < 0 || userInput > 100) {
                //Prompt for invalid input
                System.out.println("Invalid input! Guess a number between 1-100! Try again...");
                //Collect and save input
                userInput = scan.nextInt();
            }

            /*Enter this loop when response is wrong & not quitting & valid
            Exits when guess is correct or user exits
            */
            while (userInput != randomNumber && userInput != 0) {
                //Validate input (1-100)
                if (userInput >= 1 && userInput <= 100) {
                    //Check if it's greater than random
                    if (userInput > randomNumber)
                        System.out.println("Too high! Try again...");
                    //Check if it's less than random
                    else if (userInput < randomNumber)
                        System.out.println("Too low! Try again...");
                }
                //collect and save new inputs
                userInput = scan.nextInt();
                //guesses +1
                guesses++;
            }

            //If the guess is correct
            if (userInput == randomNumber) {
                //Inform the user
                System.out.println("You're correct!, the random number is " + randomNumber);
                System.out.println("You guessed " + guesses + " times.");
            }
            //If user quits the game
            else if (userInput == 0) {
                //Inform the user
                System.out.println("You just quit the game.");
                System.out.println("You guessed " + guesses + " times.");
            }

            /*Enter this loop when response is correct or user exits
            Break to exit loop
            */
            while (userInput == randomNumber || userInput == 0) {
                //Empty line
                System.out.println("");
                //Prompt & instruct user
                System.out.println("Do you want to play again?");
                System.out.println("Respond 0 for NO, 1 for YES.");
                //Collect and save input
                playAgain = scan.nextInt();

                //If user enters 0 (NO)
                if (playAgain == 0) {
                    //Set play flag to false; leave loop and exit
                    play = false;
                    break;
                }
                //If user enters 1 (YES)
                else if (playAgain == 1) {
                    //reset guesses
                    guesses = 0;
                    //Play flag remains true; leave prompt loop and start over
                    break;
                }
                //If user enters neither 0 nor 1, then response is invalid
                else
                    //Ask user to try again
                    System.out.println("Input is invalid! Try again...");
            }
        }
    }
}


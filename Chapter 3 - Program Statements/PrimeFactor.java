/*
This program calculates prime factors of an integer. User will be asked to provide a positive integer, and its prime
factors will be printed out.
*/

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        //Instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        //Prompt for a positive integer
        System.out.print("Enter a positive integer: ");
        //Collect and save user input
        int userInput = scanner.nextInt();

        /*Factor loop
        Start from 2 (first prime number)
        Continue factoring until factor reaches input*/
        for (int factor = 2; factor <= userInput; factor++) {
            /*Loop when input is divisible by factor
            Stop when factor becomes indivisible
            Factor +1 after this loop*/
            while (userInput % factor == 0) {
                //Keep dividing the input by factor
                userInput = userInput / factor;
                //Print the factor
                System.out.println(factor);
            }
        }
    }
}
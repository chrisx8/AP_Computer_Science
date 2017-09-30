/*
This program checks if you're interested in a movie based on ticket price and star rating. You'll
be asked to check another movie if the program determines that you're not interested.
*/

import java.util.Scanner;

public class seeMovie {
    private static boolean checkMovie(double ticketPrice, int rating) {
        //Define local variable
        boolean interested = false;

        //When ticket price is less than $5, you're very interested
        if (ticketPrice <= 5.0) {
            System.out.println("You are very interested in seeing this movie. And it’s cheap so you should find a date!");
            interested = true;
        }
        //When ticket price is between $5 and $12
        else if (ticketPrice > 5.0 && ticketPrice < 12.0) {
            //When rating is between 2-4, you're sort-of interested
            if (rating >= 2 && rating <= 4) {
                System.out.println("You are sort-of interested in seeing this movie. This should be good for the price.");
                interested = true;
            }
            //When rating is 5, you're very interested
            if (rating == 5) {
                System.out.println("You are very interested in seeing this movie. Go buy your tickets now!");
                interested = true;
            }
        }
        //When ticket price is over $12
        else if (ticketPrice >= 12.0) {
            //When rating is 5, you're sort-of interested
            if (rating == 5) {
                System.out.println("You are sort-of interested in seeing this movie. It should be well worth the $" +
                        ticketPrice);
                interested = true;
            }
            //If not 5, you're not interested
            else
                System.out.println("You are not interested in seeing this movie. Save that money for something else.");
        }
        //Not interested movies does not meet all criteria above
        else
            System.out.println("You are not interested in seeing this movie. Wait until it comes on cable.");

        //Return boolean value interested
        //If interested, return true
        if (interested)
            return true;
        //If not, prompt to check another movie and return false
        else {
            System.out.println("Let's check another movie.\n");
            return false;
        }
    }

    public static void main(String[] args) {
        //Instantiate new Scanner
        Scanner sc = new Scanner(System.in);

        //Define variables
        double ticketPrice;
        int rating;
        boolean interested = false;

        //Print greeting
        System.out.println("Do you want to see a movie?\n");

        while (!interested) {
            //Prompt and save ticket price (double)
            System.out.println("How much does the movie cost? ");
            System.out.print("$");
            ticketPrice = sc.nextDouble();
            //Prompt and save rating (int)
            System.out.println("What is the star rating (1-5) of the movie? ");
            rating = sc.nextInt();

            //Verify rating
            while (rating < 1 || rating > 5) {
                //Re-prompt for rating
                System.out.println("Rating is invalid! Enter again in a scale of 1-5: ");
                rating = sc.nextInt();
            }

            //Check if user is interested
            interested = checkMovie(ticketPrice, rating);
        }
    }
}

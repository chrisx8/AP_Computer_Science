/*
This program assigns seats on an airline’s only plane. User will choose first
class or economy and the number of tickets. Then the program will randomly assign seats
in the appropriate class. When tickets are sold, seat numbers and a seating chart will
be printed. When a class is full, the program will ask for an alternate class (when
available). If accepted, tickets will be sold in the new class. If not accepted, or
when alternatives are not available, print information about the next flight.
The seating charts are stored in a 2-dimensional array.
 */

package AirplaneSeating;

import java.util.Random;
import java.util.Scanner;

public class AssignSeats {
    public static void main(String[] args) {
        boolean ticketsSold;    // if tickets are sold
        int classSelection, tickets, alt;    // user inputs
        int end = 0;    // end sale when this flag != 0

        AirplaneSeating plane = new AirplaneSeating();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // User enters non-zero integers to exit sale, otherwise sale continues
        while (end == 0) {
            // Select Class
            System.out.println("Please type 1 for First Class\n" +
                    "Please type 2 for Economy");
            System.out.println("Choice: ");
            // Get and store class selection
            classSelection = sc.nextInt();
            sc.nextLine();

            // Get and store number of tickets
            System.out.println("Number of tickets: ");
            tickets = sc.nextInt();
            sc.nextLine();

            // If First is selected
            if (classSelection == 1) {
                // Sell tickets, and store boolean return
                // True if sold. False if there’s no enough seats
                ticketsSold = plane.sellFirst(rand, tickets);

                // When there’s no enough seats
                if (!ticketsSold) {
                    // Check if economy has enough seats
                    if (plane.getEconomyRemaining() >= tickets) {
                        System.out.println("First class is full. Economy class? \n" +
                                "(0 = yes, any other number = no)");
                        // Get and store if user accepts Economy
                        alt = sc.nextInt();
                        sc.nextLine();
                        // If accepted, sell economy tickets
                        if (alt == 0)
                            plane.sellEconomy(rand, tickets);
                    }
                    // If not accepted, or there’s no enough economy seats
                    else
                        System.out.println("Next flight departs in 3 hours.");
                }
            }

            // Select Economy
            else if (classSelection == 2) {
                // Sell tickets, and store boolean return
                // True if sold. False if there’s no enough seats
                ticketsSold = plane.sellEconomy(rand, tickets);

                // If tickets are not sold
                if (!ticketsSold) {
                    // Check if there’s enough seats in First
                    if (plane.getFirstRemaining() >= tickets) {
                        System.out.println("Economy class is full. First class? \n" +
                                "(0 = yes, any other number = no)");
                        // Get and store user selection
                        alt = sc.nextInt();
                        sc.nextLine();
                        // If user accepted, sell First tickets
                        if (alt == 0)
                            plane.sellFirst(rand, tickets);
                    }
                    // If user declined, or there’s no enough ticket in First
                    else
                        System.out.println("Next flight departs in 3 hours.");
                }
            }

            // When user enters neither 1 nor 2 for class selection
            else {
                System.out.println("Invalid class selection!");
            }

            // Ask if user wants more tickets
            System.out.println("Book more tickets? \n" +
                    "(0 = yes, any other number = no)");
            // Get and store selection. 0 will repeat the sale process
            end = sc.nextInt();
            sc.nextLine();
        }
    }
}
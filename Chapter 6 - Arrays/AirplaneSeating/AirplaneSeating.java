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

public class AirplaneSeating {
    private boolean[][] firstClass;    // First Seating
    private boolean[][] economyClass;    // Economy Seating
    private int firstRemaining;      // Remaining tickets in First
    private int economyRemaining;    // Remaining tickets in Economy
    private int ticketsSold;    // number of tickets sold
    private boolean enoughTickets = false;    // if there’s enough tickets
    private int row = 0;    // random seat row
    private int column = 0;     // random seat column


    public AirplaneSeating () {
        firstClass = new boolean[4][4];    // First class seat array
        economyClass = new boolean[11][6];    // Economy class seat array
        // Remaining seats in First
        firstRemaining = firstClass.length * firstClass[0].length;
        // Remaining seats in Economy
        economyRemaining = economyClass.length * economyClass[0].length;
    }

    public boolean sellFirst (Random rand, int tickets) {
        // Check if there's enough tickets to sell
        if (tickets > firstRemaining)
            enoughTickets = false;
        else {
            enoughTickets = true;
            ticketsSold = 0;    // Count number of tickets sold
            System.out.print("First Class. Seat ");
        }

        // Have enough tickets and sold less than needed
        while (enoughTickets && ticketsSold < tickets) {
            // Randomly generate column and row
            column = rand.nextInt(firstClass[0].length);
            row = rand.nextInt(firstClass.length);
            // When the random seat is not occupied
            if (!firstClass[row][column]) {
                // Sell the seat
                firstClass[row][column] = true;
                ticketsSold++;    // Increment tickets sold
                firstRemaining--;    // Reduce tickets remaining
                printFirstSeatNum(row, column);    // Print seat number
            }
            // When the random seat is occupied, loops back and generate another seat
        }

        // After the sale, print seating chart
        if (enoughTickets) {
            System.out.println("\n");
            firstSeatingChart();
        }
        return enoughTickets;    // Return if the sale is successful
    }

    public boolean sellEconomy (Random rand, int tickets) {
        // Check if there's enough tickets to sell
        if (tickets > economyRemaining)
            enoughTickets = false;
        else {
            enoughTickets = true;
            ticketsSold = 0;    // Count number of tickets sold
            System.out.print("Economy Class. Seat ");
        }
        
        // Have enough tickets and sold less than needed
        while (enoughTickets && ticketsSold < tickets) {
            // Randomly generate column and row
            column = rand.nextInt(economyClass[0].length);
            row = rand.nextInt(economyClass.length);
            // When the random seat is not occupied
            if (!economyClass[row][column]) {
                // Sell the seat
                economyClass[row][column] = true;
                ticketsSold++;    // Increment tickets sold
                economyRemaining--;    // Reduce tickets remaining
                printEconomySeatNum(row, column);
            }
            // When the random seat is occupied, loops back and generate another seat
        }

        // After the sale, print seating chart
        if (enoughTickets) {
            System.out.println("\n");
            economySeatingChart();
        }
        return enoughTickets;    // Return if the sale is successful
    }

    public void printFirstSeatNum (int row, int column) {
        // row number starts from 1
        System.out.print(row+1);
        // columns are numbered A/C/D/F
        if (column == 0)
            System.out.print("A ");
        else if (column == 1)
            System.out.print("C ");
        else if (column == 2)
            System.out.print("D ");
        else if (column == 3)
            System.out.print("F ");
    }

    public void printEconomySeatNum (int row, int column) {
        // row number starts from 5
        System.out.print(row+5);
        // columns are numbered A/B/C/D/E/F
        if (column == 0)
            System.out.print("A ");
        else if (column == 1)
            System.out.print("B ");
        else if (column == 2)
            System.out.print("C ");
        else if (column == 3)
            System.out.print("D ");
        else if (column == 4)
            System.out.print("E ");
        else if (column == 5)
            System.out.print("F ");
    }

    public void firstSeatingChart () {
        System.out.println("       A\tC\tD\tF");
        System.out.println("   ======================");
        for (int r = 0; r < firstClass.length; r++) {
            System.out.print("0");
            System.out.print(r+1);
            System.out.print(" =   ");
            for (int c = 0; c < firstClass[0].length; c++) {
                if (firstClass[r][c])
                    System.out.print("X\t");
                else
                    System.out.print("O\t");
            }
            System.out.println("=");
        }
        System.out.println("   ======================");
    }

    public void economySeatingChart () {
        System.out.println("       A\tB\tC\tD\tE\tF\t");
        System.out.println("   ==============================");
        for (int r = 0; r< economyClass.length; r++) {
            if (r < 5) {
                System.out.print("0");
                System.out.print(r+5);
            }
            else
                System.out.print(r+5);
            System.out.print(" =   ");
            for (int c = 0; c < economyClass[0].length; c++) {
                if (economyClass[r][c])
                    System.out.print("X\t");
                else
                    System.out.print("O\t");
            }
            System.out.println("=");
        }
        System.out.println("   ==============================");
    }

    public int getFirstRemaining() {
        return firstRemaining;
    }

    public int getEconomyRemaining() {
        return economyRemaining;
    }
}

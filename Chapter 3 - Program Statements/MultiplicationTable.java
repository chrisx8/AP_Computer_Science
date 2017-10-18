/*
This program produces a multiplication table, showing the results of multiplying the integers 1 through 12
by themselves.
*/

public class MultiplicationTable {
    public static void main(String[] args) {
        //Define initial variables; all starts with 1
        int numVertical = 1;
        int numHorizontal = 1;

        //This loop prints the top row 1-12
        for (int num = 1; num <= 12; num++) {
            //Start the row with 2 tabs
            if (num == 1)
                System.out.print("\t\t" + num);
            //Continue with one tab between numbers
            else
                System.out.print("\t" + num);
        }

        //Print a divider
        System.out.println("\n--------------------------------------------------------");

        //This loop calculates; Stops when Horizontal/Vertical numbers reach 12
        while (numHorizontal <= 12 && numVertical <= 12) {
            //Print left column
            //Print a space before single-digit numbers; A space, |, and tab after numbers
            if (numHorizontal == 1 && numVertical <= 9)
                System.out.print(" " + numVertical + " |\t");
            //Print the number; A space, | and tab after numbers
            else if (numHorizontal == 1 && numVertical >= 10)
                System.out.print(numVertical + " |\t");

            //Calculate from left to right of the table
            //If Horizontal number < 12, continue calculation until it reaches 12
            if (numHorizontal < 12) {
                //Print the result and a tab after it
                System.out.print(numVertical * numHorizontal + "\t");
                //continue
                numHorizontal++;
            }
            //If Horizontal number = 12, reset and move on to the next row
            else if (numHorizontal == 12) {
                //Print the result
                System.out.println(numVertical * numHorizontal);
                //Reset horizontal number
                numHorizontal = 1;
                //move on to the next row
                numVertical++;
            }
        }
    }
}

/*
 Use a one-dimensional array to solve the following problem:
 Write an application that inputs five numbers, each of witch is between 10 and 100, inclusive. As
 each number is read, display it only if it is not a duplicate of a number already read. Provide
 for the "worst case," in which all five numbers are different. User the smallest possible array
 to solve this problem. Display the complete set of unique values input after the user inputs each
 new value.
 */

package UniqueNumber;

import java.util.Scanner;

public class Unique {
    // Gets 5 unique numbers from the user
    public void getNumbers() {
        Scanner input = new Scanner (System.in);

        int[] numbers = new int[5];  // an array of five elements
        int count = 0;  // numbers of uniques
        int entered = 0;  // number of user inputs

        // a input/validate loop that asks for 5 user inputs
        while (entered < numbers.length) {
            System.out.print("Enter number:");
            int number = input.nextInt();  // Get and store inputs from the user

            // Validate inputs
            // First check if the number is between 10 and 100
            if (number >= 10 && number <= 100) {
                // flags whether this number already exists
                boolean containsNumber = false;

                // Increment number of entered numbers
                entered++;

                // Compare the input to the unique numbers in the array
                for (int i : numbers) {
                    // If duplicate is found, change containsNumber to true
                    if (i == number)
                        containsNumber = true;
                }

                // If the number is unique, stores the number
                if (!containsNumber) {
                    // Increment unique items count
                    count++;

                    // Add number to the first available empty space in the array
                    for (int i = 0; i < numbers.length; i++) {
                        // If a place is zero, it means that space is empty.
                        if (numbers[i] == 0) {
                            // Stores the number in that space, and break out the loop
                            numbers[i] = number;
                            break;
                        }
                    }
                }
                // When number is already entered
                else {
                    System.out.printf("%d has already been entered\n", number);
                }
            }
            // When number is out of 10-100 range
            else {
                System.out.println("Number must be between 10 and 100.");
            }

            // Print the list of unique values
            // Cycles through the array and prints every non-zero values,
            // with a space in between
            for (int i : numbers) {
                if (i != 0)
                    System.out.print(i+" ");
            }
            // Create a new line after each run of the while loop
            System.out.println();
        }
    }
}
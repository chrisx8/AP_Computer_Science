/*
Asks the user to enter a series of 10 numbers. The 10 numbers should be stored in an array.
Then, the program will:
- Display the lowest number in the array
- Display the highest number in the array
- Display the total of numbers
- Display the average of numbers
 */

package Sorting;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];    // Define the array to store the 10 numbers
        double total = 0;    // Define and initialize the total variable
        double average;    // Define the average variable

        // This loop asks the user to input 10 numbers
        for (int i=0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = sc.nextInt();
            System.out.println();
        }

        // This loop finds the largest number
        int max = numbers[0];
        for (int n : numbers) {
            // Compare each number in the array to the current max
            // Update current max when a larger number is found
            if (n > max) {
                max = n;
            }
        }

        // This loop finds the largest number
        int min = numbers[0];
        for (int n : numbers) {
            // Compare each number in the array to the current min
            // Update current min when a smaller number is found
            if (n < min) {
                min = n;
            }
        }

        // Add each number in the array to a running total
        for (int item : numbers) {
            total += item;
        }

        // Divide the total by the length for the average
        average = total / numbers.length;

        System.out.println("The largest number is "+max);
        System.out.println("The smallest number is "+min);
        System.out.println("The total is "+total);
        System.out.println("The average is "+average);
    }
}

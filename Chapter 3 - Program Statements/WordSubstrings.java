/*
This program asks for a word and prints all possible substrings, sorted by length.
*/

import java.util.Scanner;

public class WordSubstrings {
    public static void main(String[] args) {
        //Instantiate Scanner
        Scanner sc = new Scanner(System.in);

        //Prompt for a string
        System.out.println("Enter a word: ");
        //Collect and save string
        String input = sc.nextLine();

        //Define variables
        int posStart = 0;  //Start position on input string
        int posEnd = 1; //End position on input string
        int count = 0; //Number of rows ran

        /*Substring loop
        Make and print substrings until substring is the same as the word
        aka count (start from 0) one less than length
        */
        while (count < input.length()) {
            //Print the current substring
            System.out.println(input.substring(posStart, posEnd));
            //When start position reaches the upper bound (last position to form a substring)
            if (posStart == input.length() - count - 1)
                //Reset start position to 0
                posStart = 0;
            //When not reaching the upper bound
            else
                //Move one forward
                posStart++;
            //When end position reaches the end of the input string
            if (posEnd == input.length()) {
                //Round count +1
                count++;
                //Reset end position to one above round count
                posEnd = 1 + count;
            }
            //When not reaching the end
            else
                //Move one forward
                posEnd++;
        }
    }
}
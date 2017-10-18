/*
This program reads a string from the user, then determines and prints how many vowels appear in the entire string. Each
vowel is counted separately. This program also counts and prints the number of other characters.
*/

import java.util.Scanner;

public class VowelInString {
    /*Define a method for counting occurrence
    Require 3 parameters: input string, uppercase character, lowercase character
    */
    public static int countOccurrence(String input, char charUpper, char charLower) {
        //Define local variables
        int pos = 0;  //Position on input string
        int count = 0;  //Count of matching character

        //Loop for counting. Continue until position reaches the end of input string
        while (pos < input.length()) {
            //If uppercase character or lowercase character exists
            if (input.charAt(pos) == charUpper || input.charAt(pos) == charLower) {
                //Count +1
                count++;
            }
            //Move one position forward
            pos++;
        }
        return count;
    }

    public static void main(String[] args) {
        //Instantiate Scanner
        Scanner sc = new Scanner(System.in);

        //Define variables
        int countA, countE, countI, countO, countU, countVowels, countOther;

        //Prompt for a string
        System.out.println("Enter a string: ");
        //Collect and save string
        String input = sc.nextLine();

        //Count A
        countA = countOccurrence(input, 'A', 'a');
        //Count E
        countE = countOccurrence(input, 'E', 'e');
        //Count I
        countI = countOccurrence(input, 'I', 'i');
        //Count O
        countO = countOccurrence(input, 'O', 'o');
        //Count U
        countU = countOccurrence(input, 'U', 'u');

        //Total number of vowels
        countVowels = countA + countE + countI + countO + countU;
        //Number of other characters
        countOther = input.length() - countVowels;

        //Print results
        System.out.println("There are " + countVowels + " Vowels, and " + countOther + " other characters");
        System.out.println("Specifically: \n" +
                countA + " A\n" +
                countE + " E\n" +
                countI + " I\n" +
                countO + " O\n" +
                countU + " U");
    }
}

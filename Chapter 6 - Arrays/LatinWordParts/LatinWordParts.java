/*
This program reads a series of words from a user and tries to count how often a handful
of common Latin word parts show up in those words. The Latin parts you will be looking for can be
found below as identified by Roots, Prefixes, and Suffixes. Everything is stored in arrays.
*/


package LatinWordParts;

import java.util.Scanner;

public class LatinWordParts {
    public static void main(String[] args) {
        // Establish arrays of roots/prefixes/suffixes
        String[] roots = {"dict", "duc", "gress", "ject", "pel", "pend", "port",
                "scrib", "script", "tract", "vert"};
        String[] prefixes = {"co", "de", "dis", "inter", "non", "not", "post",
                "pre", "re", "sub", "trans"};
        String[] suffixes = {"able", "ible", "ation", "fy", "ify", "ment", "ty", "ity"};

        // Define empty arrays to hold counts of each item
        // Counts are stored in the same order as roots/prefixes/suffixes arrays
        int[] rootCount = new int[roots.length];
        int[] prefixCount = new int[prefixes.length];
        int[] suffixCount = new int[suffixes.length];

        // Define more variables
        int countInput = 0;    // Number of inputs
        String findPrefix = "";    // The prefix that is checking
        String findSuffix = "";    // The suffix that is checking

        // Instantiate scanner for inputs
        Scanner sc = new Scanner(System.in);

        // Prompt and store number of inputs
        System.out.println("How many words do you want to input?");
        countInput = sc.nextInt();
        sc.nextLine();

        // Define array to store input
        String[] input = new String[countInput];

        // Prompt and store inputs in the input array
        for (int i = 0; i < countInput; i++) {
            System.out.println("Enter a word: ");
            input[i] = sc.nextLine();
        }


        // Check if an input item contains certain roots/prefixes/suffixes
        for (String i : input) {
            // Check if the word contains any roots
            // Cycle through each root and check if the input contains it
            for (int r = 0; r < roots.length; r++) {
                if (i.indexOf(roots[r]) != -1)
                    rootCount[r]++;    // Increment root count in rootCount
            }

            // Check if the word contains any prefixes
            // Cycle through each prefix and check if the input contains it
            for (int p = 0; p < prefixes.length; p++) {
                // If the word is not shorter than the prefix
                if (i.length() >= prefixes[p].length())
                    // Get the first several characters of the word
                    // The number of characters = length of the prefix
                    findPrefix = i.substring(0, prefixes[p].length());

                if (findPrefix.equals(prefixes[p]))
                    prefixCount[p]++;    // Increment prefix count in prefixCount
            }
            for (int s = 0; s < suffixes.length; s++) {
                // If the word is not shorter than the suffix
                if (i.length() >= suffixes[s].length())
                    // Get the last several characters of the word
                    // The number of characters = length of the suffix
                    findSuffix = i.substring(i.length() - suffixes[s].length(),
                        i.length());
                if (findSuffix.equals(suffixes[s]))
                    suffixCount[s]++;    // Increment prefix count in suffixCount
            }
        }

        // Print out all roots and a count of each
        System.out.println("Roots: ");
        for (int r = 0; r < roots.length; r++) {
            System.out.println(roots[r]+" \t"+rootCount[r]);
        }

        // Print out all prefixes and a count of each
        System.out.println("\nPrefixes: ");
        for (int p = 0; p < prefixes.length; p++) {
            System.out.println(prefixes[p]+" \t"+prefixCount[p]);
        }

        // Print out all suffixes and a count of each
        System.out.println("\nSuffixes: ");
        for (int s = 0; s < suffixes.length; s++) {
            System.out.println(suffixes[s]+" \t"+suffixCount[s]);
        }
    }
}

/*
Write a program that uses BandBooster objects to track the sales of 2 band boosters over 3 weeks. Your program should
do the following:
- Read in the names of the two band boosters and construct an object for each.
- Prompt for and read in the number of boxes sold by each booster for each of the three weeks. Your prompts should include
the booster’s name as stored in the BandBooster object.
For example, Enter the number of boxes sold by Joe this week: For each member, after reading in the weekly sales, invoke
the updateSales method to update the total sales by that member.
- After reading the data, print the name and total sales for each member (you will implicitly use the toString method here).
*/

package BandBooster;

import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
        //Initialize scanner
        Scanner sc = new Scanner(System.in);

        //Initialize two BandBooster objects
        BandBooster bb_joe = new BandBooster("Joe");
        BandBooster bb_lauren = new BandBooster("Lauren");

        //Prompt and Read sale numbers
        System.out.println("Enter sale number for Joe (week 1): ");
        bb_joe.updateSales(sc.nextInt());
        System.out.println("Enter sale number for Joe (week 2): ");
        bb_joe.updateSales(sc.nextInt());
        System.out.println("Enter sale number for Joe (week 3): ");
        bb_joe.updateSales(sc.nextInt());

        System.out.println("Enter sale number for Lauren (week 1): ");
        bb_lauren.updateSales(sc.nextInt());
        System.out.println("Enter sale number for Lauren (week 2): ");
        bb_lauren.updateSales(sc.nextInt());
        System.out.println("Enter sale number for Lauren (week 3): ");
        bb_lauren.updateSales(sc.nextInt());

        //Print name and total sales
        System.out.println(bb_joe.toString());
        System.out.println(bb_lauren.toString());
    }
}

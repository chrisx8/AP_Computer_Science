/* Calculates the value of coins in a jar and prints the total in dollars and cents */

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //get number of coins from users
        System.out.println("Enter number of quarters: ");
        int quarter = scan.nextInt();
        System.out.println("Enter number of dimes: ");
        int dime = scan.nextInt();
        System.out.println("Enter number of nickels: ");
        int nickle = scan.nextInt();
        System.out.println("Enter number of pennies: ");
        double penny = scan.nextInt();
        //calculate total $
        double totalDollar = quarter*0.25 + dime*0.10 + nickle*0.05+ penny*0.01;
        System.out.println("Total: $"+totalDollar);
    }
}

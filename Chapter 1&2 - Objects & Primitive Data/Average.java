/* an application that reads three numbers and prints their average */

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //get 3 integers from user
        System.out.println("Enter your first integer: ");
        int x = scan.nextInt();
        System.out.println("Enter your second integer: ");
        int y = scan.nextInt();
        System.out.println("Enter your last integer: ");
        int z = scan.nextInt();
        //calculate average in double
        //show decimals
        double average = (x+y+z)/3.0;
        System.out.println("Average: "+average);
    }
}
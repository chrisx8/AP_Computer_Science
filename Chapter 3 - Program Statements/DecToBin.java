/*
This program reads an integer value and prints all of its binary digits in reverse order.
*/

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        //Instantiate scanner
        Scanner sc = new Scanner(System.in);

        //Prompt for a integer
        System.out.println("Enter an integer: ");
        //Collect and save input
        int userInput = sc.nextInt();

        //Convert input to binary string
        while (userInput > 0) {
            if (userInput % 2 == 1) {
                System.out.println(1);
            }
            else if (userInput % 2 == 0){
                System.out.println(0);
            }
            userInput = userInput / 2;
        }
    }
}

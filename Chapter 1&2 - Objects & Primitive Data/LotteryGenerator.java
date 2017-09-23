/*
creates and prints a random number so we can win the next powerball lottery.
The lottery number should include 5 random numbers, which can range from 1-65, 
and a powerball number, which can range from  1-26, for a total of 6 numbers.
*/

import java.util.Random;

public class LotteryGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        //Generate 5 lottery numbers in range 1-65
        int Lottery1 = rand.nextInt(65) +1;
        int Lottery2 = rand.nextInt(65) +1;
        int Lottery3 = rand.nextInt(65) +1;
        int Lottery4 = rand.nextInt(65) +1;
        int Lottery5 = rand.nextInt(65) +1;
        //Generate a Powerball number in range 1-26
        int Powerball = rand.nextInt(26) + 1;
        //Print lottery numbers
        System.out.println("Your lottery numbers are: "+Lottery1+" "+Lottery2+" "+Lottery3+" "+Lottery4+" "+Lottery5);
        //Print Powerball number
        System.out.println("Your powerball number is: "+Powerball);
    }
}
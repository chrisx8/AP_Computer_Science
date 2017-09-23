/*
This program is a conversation between computer and the user. It will ask
the user to answer 3 questions (one requires a string, and the other two
asks for integers). Then, the inputs will be printed back to the user.
*/

import java.util.Scanner;
import java.util.Random;

public class SimpleIOMath {
    private static void Greeting() {
        //Print greeting messages
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
    }

    private static void SingItOut() {
        //Print first verse
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
    }

    private static void PrintUserInfo(String name, int age, int favoriteNumber) {
        //Print name
        System.out.println("Your name is: " + name);
        //Print age
        System.out.println("Your age is: " + age);
        //Print sqrt of age
        System.out.println("The square root of your age is: " + Math.sqrt(age));
        //Print favorite number
        System.out.println("Your favorite number is: " + favoriteNumber);
        //Print favorite number squared
        System.out.println("Your favorite number squared is: " + Math.pow(favoriteNumber, 2));
    }

    private static void LotteryNumbers() {
        //Instantiate random
        Random rand = new Random();
        //Generate 5 random numbers (1-100)
        int FirstNumber = rand.nextInt(100) + 1;
        int SecondNumber = rand.nextInt(100) + 1;
        int ThirdNumber = rand.nextInt(100) + 1;
        int FourthNumber = rand.nextInt(100) + 1;
        int FifthNumber = rand.nextInt(100) + 1;
        //Print generated numbers
        System.out.println("You should play the following numbers in the lottery: " +
                FirstNumber + ", " + SecondNumber + ", " + ThirdNumber + ", " + FourthNumber + ", " + FifthNumber);
    }

    public static void main(String[] args) {
        //Instantiate scanner
        Scanner sc = new Scanner(System.in);
        //Print greeting messages
        Greeting();

        //Ask name(str), age(int), favorite number(int)
        System.out.println("Question 1: What is your name?");
        String name = sc.nextLine();
        System.out.println("Question 2: How old are you?");
        int age = sc.nextInt();
        System.out.println("Question 3: What is your favorite number?");
        int favoriteNumber = sc.nextInt();

        //Print first verse
        SingItOut();
        //Print name,age,sqrt age, favorite number, favorite number squared
        PrintUserInfo(name, age, favoriteNumber);
        //Generate and print 5 random lottery numbers
        LotteryNumbers();
    }
}

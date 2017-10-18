/*
This program reads a set of data values. When all values have been read, print out the count of the values, the average,
and standard deviation.
After entering every data value, user will be asked if there is more data.
*/

import java.util.Scanner;

public class StdDeviation {
    public static void main(String[] args) {
        //Instantiate Scanner
        Scanner sc = new Scanner(System.in);

        //Define variables
        double sum = 0;  //sum of data values
        double squareSum = 0;  //sum of square of data values
        int count = 0;  //number of values
        boolean prompt = true;  //prompt flag

        /*Prompt and calculation loop
        Ends when prompt flag is set to false*/
        while (prompt) {
            //Prompt for a number
            System.out.println("Enter a number: ");
            //Collect and save a double
            double input = sc.nextDouble();

            //Calculate the square
            double inputSquare = Math.pow(input,2);
            //count +1
            count++;
            //Add input to sum
            sum += input;
            //Add input squared to squareSum
            squareSum += inputSquare;

            //Ask if there is more data
            System.out.println("Do you have more data? (0=yes / 1=no)");
            //Collect and save response
            int moreData = sc.nextInt();
            //Set prompt flag to false when user responds 1
            if (moreData == 1)
                prompt = false;
        }

        //Calculate average
        double average = sum / count;

        //Calculate variance standard deviation
        //Expanded standard deviation formula - SUM OF (number-mean)^2 / count
        double variance = Math.abs((squareSum - 2 * average * sum + count * Math.pow(average,2)) / count);
        //square root of variance is standard deviation
        double stdDeviation = Math.sqrt(variance);
        //Print results
        System.out.println("You've entered "+count+" numbers.\n"+
                "The average is "+average+".\n"+
                "The standard deviation is "+stdDeviation+".");
    }
}

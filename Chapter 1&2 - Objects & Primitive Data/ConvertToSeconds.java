/*
reads values representing a time in hours, minutes and seconds. Then
print the same time in seconds.
*/

import java.util.Scanner;

public class ConvertToSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //get hour/minute/second from user
        System.out.println("Enter hour: ");
        int hour = scan.nextInt();
        System.out.println("Enter minute: ");
        int minute = scan.nextInt();
        System.out.println("Enter second: ");
        int second = scan.nextInt();
        //calculate total seconds
        int totalSecond = hour*3600 + minute*60 + second;
        System.out.println(hour+" hour "+minute+" minute "+second+" second is "+totalSecond+" second");
    }
}

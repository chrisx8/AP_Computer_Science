/* read the (x,y) coordinates for two points and calculate distance */

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Getting two points (x1,y1) and (x2, y2)");
        //get two coordinates (x1,y1) and (x2,y2)
        System.out.println("Enter x1: ");
        double x1 = scan.nextDouble();
        System.out.println("Enter y1: ");
        double y1 = scan.nextDouble();
        System.out.println("Enter x2: ");
        double x2 = scan.nextDouble();
        System.out.println("Enter y2: ");
        double y2 = scan.nextDouble();
        //calculate distance
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Distance: "+distance);
    }
}
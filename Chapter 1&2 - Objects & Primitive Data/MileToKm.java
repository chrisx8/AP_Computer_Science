/*An application that converts miles into kilometers*/
import java.util.Scanner;

public class MileToKm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //in DOUBLE
        System.out.println("Enter number in miles: ");
        //get mile from user
        double mile_double = scan.nextDouble();
        //convert
        //1mi=1.60935km
        double km_double = mile_double * 1.60935;
        System.out.println(mile_double+" miles is "+km_double+" kilometers");
    }
}

/*
computes and displays the perimeter of a letter-size(8.5 x 11 inch)
sheet of paper and the length of its diagonal
*/

public class LetterSheet {
    public static void main(String[] args) {
        //Define width & length
        final double WIDTH = 8.5;
        final int LENGTH = 11;
        //Calcuclate perimeter
        double perimeter = 2*(WIDTH+LENGTH);
        //Calculate diagonal
        double diagonal = Math.sqrt(WIDTH * WIDTH + LENGTH * LENGTH);
        //Print perimeter and diagonal
        System.out.printf("The perimeter is %.2f inches\n", perimeter);
        System.out.printf("The diagonal is %.2f inches", diagonal);
    }
}
/*
An executable program using the 'MultPractice' class (implementation of interface 'StudyPractice').
This program creates a multiplication problem
 */

package MultPractice;

public class runPractice {
    public static void main(String[] args) {
        // Create a new instance
        MultPractice mt = new MultPractice(4,2);

        // Prints the problem (string)
        System.out.println(mt.getProblem());

        /*
         Create the next problem. The second number will be increased by 1, the first number
         remain unchanged
        */
        mt.nextProblem();

        // Prints the new problem (string)
        System.out.println(mt.getProblem());    
        
    }   
}
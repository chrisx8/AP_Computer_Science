/*
Definition of a class that implements the interface 'StudyPractice'.
 */

/*
According to the interface 'StudyPractice', this class requires a 'getProblem' method
(returning String), and a 'nextProblem' method (void).
 */
package MultPractice;

public class MultPractice implements StudyPractice {
    int firstNum, secondNum;

    // Initializes by creating a multiplication problem with two integers
    public MultPractice (int inputA, int inputB) {
        firstNum = inputA;
        secondNum = inputB;
    }

    // Returns the problem as a string
    public String getProblem() {
        return firstNum + " TIMES "+secondNum;
    }

    // Create the next problem, which increases the second number by 1
    public void nextProblem() {
        secondNum++;
    }
}
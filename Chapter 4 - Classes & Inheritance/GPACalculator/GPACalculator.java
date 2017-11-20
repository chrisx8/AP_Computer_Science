/*
Create a driver program that allows you to create at least 3 students. Use both constructors to create at least one of
the students.  The calculateGPA method should calculate the GPA for the given student with the rules about the grades
given above.  For each student you create, your program should also allow for the user to enter in the class, grade, and
designate whether the class is AP or Honors (up to 7 classes available)
You should be able to view your students if prompted.  You can use toString to do this and you should be able to do this
with your other methods and variables.
*/

package GPACalculator;

import java.util.Scanner;

public class GPACalculator {
    // Prompt for student courses/grades
    private static void studentPrompt (student student, Scanner sc) {
        System.out.println("Name of course 1: ");
        student.setClass1(sc.nextLine());
        System.out.println("Is this course AP (true/false)?");
        if (sc.nextBoolean())
            student.setClass1_AP(true);
        else {
            System.out.println("Is this course Honors (true/false)?");
            student.setClass1_H(sc.nextBoolean());
        }
        System.out.println("Grade of course 1 (integer only): ");
        student.setClass1_Grade(sc.nextInt());
        sc.nextLine();
        System.out.println("Name of course 2: ");
        student.setClass2(sc.nextLine());
        System.out.println("Is this course AP (true/false)?");
        if (sc.nextBoolean())
            student.setClass2_AP(true);
        else {
            System.out.println("Is this course Honors (true/false)?");
            student.setClass2_H(sc.nextBoolean());
        }
        System.out.println("Grade of course 2 (integer only): ");
        student.setClass2_Grade(sc.nextInt());
        sc.nextLine();
        System.out.println("Name of course 3: ");
        student.setClass3(sc.nextLine());
        System.out.println("Is this course AP (true/false)?");
        if (sc.nextBoolean())
            student.setClass3_AP(true);
        else {
            System.out.println("Is this course Honors (true/false)?");
            student.setClass3_H(sc.nextBoolean());
        }
        System.out.println("Grade of course 3 (integer only): ");
        student.setClass3_Grade(sc.nextInt());
        sc.nextLine();
        System.out.println("Name of course 4: ");
        student.setClass4(sc.nextLine());
        System.out.println("Is this course AP (true/false)?");
        if (sc.nextBoolean())
            student.setClass4_AP(true);
        else {
            System.out.println("Is this course Honors (true/false)?");
            student.setClass4_H(sc.nextBoolean());
        }
        System.out.println("Grade of course 4 (integer only): ");
        student.setClass4_Grade(sc.nextInt());
        sc.nextLine();
        System.out.println("Name of course 5: ");
        student.setClass5(sc.nextLine());
        System.out.println("Is this course AP (true/false)?");
        if (sc.nextBoolean())
            student.setClass5_AP(true);
        else {
            System.out.println("Is this course Honors (true/false)?");
            student.setClass5_H(sc.nextBoolean());
        }
        System.out.println("Grade of course 5 (integer only): ");
        student.setClass5_Grade(sc.nextInt());
        sc.nextLine();
        if (moreCourses(sc)) {
            System.out.println("Name of course 6: ");
            student.setClass6(sc.nextLine());
            System.out.println("Is this course AP (true/false)?");
            if (sc.nextBoolean())
                student.setClass6_AP(true);
            else {
                System.out.println("Is this course Honors (true/false)?");
                student.setClass6_H(sc.nextBoolean());
            }
            System.out.println("Grade of course 6 (integer only): ");
            student.setClass6_Grade(sc.nextInt());
            sc.nextLine();
            if (moreCourses(sc)) {
                System.out.println("Name of course 7: ");
                student.setClass7(sc.nextLine());
                System.out.println("Is this course AP (true/false)?");
                if (sc.nextBoolean())
                    student.setClass7_AP(true);
                else {
                    System.out.println("Is this course Honors (true/false)?");
                    student.setClass7_H(sc.nextBoolean());
                }
                System.out.println("Grade of course 7 (integer only): ");
                student.setClass7_Grade(sc.nextInt());
                sc.nextLine();
            }
        }
    }

    private static boolean moreCourses (Scanner sc) {
        System.out.println("Do you have more courses (true/false)");
        boolean isComplete = sc.nextBoolean();
        sc.nextLine();
        return isComplete;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create student object with empty information
        student student1 = new student();
        // Create two other student objects with information
        student student2 = new student("Bob", 'M', "Smith", "Freshman");
        student student3 = new student("Eve", 'H', "Lee", "Senior");

        // set Alice's name/grade level
        student1.setFirstName("Alice");
        student1.setMiddleInitial('G');
        student1.setLastName("McSmart");
        student1.setClassification("Junior");

        System.out.println("You need a MINIMUM of 5 courses, and a MAXIMUM of 7 courses.\n");
        // Class/grade prompts for each student
        // Ask for name of course, if it's Honors/AP, grade of course
        System.out.println("[Getting information for Alice]");
        studentPrompt(student1, sc);
        student1.calculateGPA();    //Calculate student GPA
        System.out.println(student1);    //Print student info/grade/GPA

        System.out.println("[Getting information for Bob]");
        //sc.nextLine();
        studentPrompt(student2, sc);
        student2.calculateGPA();    //Calculate student GPA
        System.out.println(student2);    //Print student info/grade/GPA

        System.out.println("[Getting information for Eve]");
        //sc.nextLine();
        studentPrompt(student3, sc);
        student3.calculateGPA();    //Calculate student GPA
        System.out.println(student3);    //Print student info/grade/GPA
    }
}

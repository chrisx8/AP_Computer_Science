/*
Create a student class that defines a student.
Include First name, Last name, MI, Grade level (Classification), name of class, grade, isAP, isHonors, and calculate
semester GPA.
*/

package GPACalculator;

public class student {
    private int countClass = 0;    //Count number of courses entered
    private double totalGPA = 0;    //Total GPA points, not averaged
    private double SemesterGPA = 0;    //Averaged
    private String FirstName;
    private String LastName;
    private char MiddleInitial;
    private String Classification;    //Grade level (freshman, sophomore, junior, senior)
    private String Class1 = "";    //Name of course
    private String Class2 = "";    //Name of course
    private String Class3 = "";    //Name of course
    private String Class4 = "";    //Name of course
    private String Class5 = "";    //Name of course
    private String Class6 = "";    //Name of course
    private String Class7 = "";    //Name of course
    private int Class1_Grade = 0;    //Grade in the class
    private int Class2_Grade = 0;    //Grade in the class
    private int Class3_Grade = 0;    //Grade in the class
    private int Class4_Grade = 0;    //Grade in the class
    private int Class5_Grade = 0;    //Grade in the class
    private int Class6_Grade = 0;    //Grade in the class
    private int Class7_Grade = 0;    //Grade in the class
    private String Class1_Letter = "";    //Letter grade in the class
    private String Class2_Letter = "";    //Letter grade in the class
    private String Class3_Letter = "";    //Letter grade in the class
    private String Class4_Letter = "";    //Letter grade in the class
    private String Class5_Letter = "";    //Letter grade in the class
    private String Class6_Letter = "";    //Letter grade in the class
    private String Class7_Letter = "";    //Letter grade in the class
    private Boolean Class1_AP = false;    //if the course is AP
    private Boolean Class1_H = false;    //if the course is Honors
    private Boolean Class2_AP = false;    //if the course is AP
    private Boolean Class2_H = false;    //if the course is Honors
    private Boolean Class3_AP = false;    //if the course is AP
    private Boolean Class3_H = false;    //if the course is Honors
    private Boolean Class4_AP = false;    //if the course is AP
    private Boolean Class4_H = false;    //if the course is Honors
    private Boolean Class5_AP = false;    //if the course is AP
    private Boolean Class5_H = false;    //if the course is Honors
    private Boolean Class6_AP = false;    //if the course is AP
    private Boolean Class6_H = false;    //if the course is Honors
    private Boolean Class7_AP = false;    //if the course is AP
    private Boolean Class7_H = false;    //if the course is Honors

    //An empty constructor that set all variables empty
    public student () {
        FirstName = "";
        LastName = "";
        MiddleInitial = ' ';
        Classification = "";
    }

    //Get First Name, MI, Last Name, name of course as parameter
    public student (String FName, char MI, String LName, String GradeLevel) {
        FirstName = FName;
        MiddleInitial = MI;
        LastName = LName;
        Classification = GradeLevel;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public char getMiddleInitial() {
        return MiddleInitial;
    }

    public String getClassification() {
        return Classification;
    }

    public String getClass1() {
        return Class1;
    }

    public String getClass2() {
        return Class2;
    }

    public String getClass3() {
        return Class3;
    }

    public String getClass4() {
        return Class4;
    }

    public String getClass5() {
        return Class5;
    }

    public String getClass6() {
        return Class6;
    }

    public String getClass7() {
        return Class7;
    }

    public int getClass1_Grade() {
        return Class1_Grade;
    }

    public int getClass2_Grade() {
        return Class2_Grade;
    }

    public int getClass3_Grade() {
        return Class3_Grade;
    }

    public int getClass4_Grade() {
        return Class4_Grade;
    }

    public int getClass5_Grade() {
        return Class5_Grade;
    }

    public int getClass6_Grade() {
        return Class6_Grade;
    }

    public int getClass7_Grade() {
        return Class7_Grade;
    }

    public Double getSemesterGPA() {
        return SemesterGPA;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setMiddleInitial(char middleInitial) {
        MiddleInitial = middleInitial;
    }

    public void setClassification(String classification) {
        Classification = classification;
    }

    public void setClass1(String class1) {
        Class1 = class1;
    }

    public void setClass2(String class2) {
        Class2 = class2;
    }

    public void setClass3(String class3) {
        Class3 = class3;
    }

    public void setClass4(String class4) {
        Class4 = class4;
    }

    public void setClass5(String class5) {
        Class5 = class5;
    }

    public void setClass6(String class6) {
        Class6 = class6;
    }

    public void setClass7(String class7) {
        Class7 = class7;
    }

    //Set grade for each course; count number of courses; assign letter grade; calculate course GPA points
    public void setClass1_Grade(int class1_Grade) {
        Class1_Grade = class1_Grade;
        countClass++;
        Class1_Letter = processGrade(Class1_Grade, Class1_H, Class1_AP);
    }

    public void setClass2_Grade(int class2_Grade) {
        Class2_Grade = class2_Grade;
        countClass++;
        Class2_Letter = processGrade(Class2_Grade, Class2_H, Class2_AP);
    }

    public void setClass3_Grade(int class3_Grade) {
        Class3_Grade = class3_Grade;
        countClass++;
        Class3_Letter = processGrade(Class3_Grade, Class3_H, Class3_AP);
    }

    public void setClass4_Grade(int class4_Grade) {
        Class4_Grade = class4_Grade;
        countClass++;
        Class4_Letter = processGrade(Class4_Grade, Class4_H, Class4_AP);
    }

    public void setClass5_Grade(int class5_Grade) {
        Class5_Grade = class5_Grade;
        countClass++;
        Class5_Letter = processGrade(Class5_Grade, Class5_H, Class5_AP);
    }

    public void setClass6_Grade(int class6_Grade) {
        Class6_Grade = class6_Grade;
        countClass++;
        Class6_Letter = processGrade(Class6_Grade, Class6_H, Class6_AP);
    }

    public void setClass7_Grade(int class7_Grade) {
        Class7_Grade = class7_Grade;
        countClass++;
        Class7_Letter = processGrade(Class7_Grade, Class7_H, Class7_AP);
    }

    public void setClass1_AP(Boolean class1_AP) {
        Class1_AP = class1_AP;
    }

    public void setClass1_H(Boolean class1_H) {
        Class1_H = class1_H;
    }

    public void setClass2_AP(Boolean class2_AP) {
        Class2_AP = class2_AP;
    }

    public void setClass2_H(Boolean class2_H) {
        Class2_H = class2_H;
    }

    public void setClass3_AP(Boolean class3_AP) {
        Class3_AP = class3_AP;
    }

    public void setClass3_H(Boolean class3_H) {
        Class3_H = class3_H;
    }

    public void setClass4_AP(Boolean class4_AP) {
        Class4_AP = class4_AP;
    }

    public void setClass4_H(Boolean class4_H) {
        Class4_H = class4_H;
    }

    public void setClass5_AP(Boolean class5_AP) {
        Class5_AP = class5_AP;
    }

    public void setClass5_H(Boolean class5_H) {
        Class5_H = class5_H;
    }

    public void setClass6_AP(Boolean class6_AP) {
        Class6_AP = class6_AP;
    }

    public void setClass6_H(Boolean class6_H) {
        Class6_H = class6_H;
    }

    public void setClass7_AP(Boolean class7_AP) {
        Class7_AP = class7_AP;
    }

    public void setClass7_H(Boolean class7_H) {
        Class7_H = class7_H;
    }

    //Calculate GPA and assign letter grade for each course
    private String processGrade(int classGrade, boolean isH, boolean isAP) {
        double classGPA;    //GPA points for the class. Will be added to a total
        String classLetter;    //Letter grade for the class. Will be returned
        //Calculate unweighted GPA and assign letter grade
        if (classGrade >= 98) {
            classGPA = 4.33;
            classLetter = "A+";
        }
        else if (classGrade >= 93) {
            classGPA = 4.00;
            classLetter = "A";
        }
        else if (classGrade >= 90) {
            classGPA = 3.67;
            classLetter = "A-";
        }
        else if (classGrade >= 87) {
            classGPA = 3.33;
            classLetter = "B+";
        }
        else if (classGrade >= 83) {
            classGPA = 3.00;
            classLetter = "B";
        }
        else if (classGrade >= 80) {
            classGPA = 2.67;
            classLetter = "B-";
        }
        else if (classGrade >=77) {
            classGPA = 2.33;
            classLetter = "C+";
        }
        else if (classGrade >= 73) {
            classGPA = 2.00;
            classLetter = "C";
        }
        else if (classGrade >= 70) {
            classGPA = 1.67;
            classLetter = "C-";
        }
        else if (classGrade >= 67) {
            classGPA = 1.33;
            classLetter = "D+";
        }
        else if (classGrade >= 63) {
            classGPA = 1.00;
            classLetter = "D";
        }
        else if (classGrade >= 60) {
            classGPA = 0.67;
            classLetter = "D-";
        }
        else {
            classGPA = 0.00;
            classLetter = "F";
        }
        // Add 0.50 if class is Honors
        if (isH)
            classGPA += 0.50;
        // Add 1.00 if class is AP
        else if (isAP)
            classGPA += 1.00;
        totalGPA += classGPA;    //Add to total
        return classLetter;    //Return the letter grade
    }

    //Calculate weighted semester GPA
    public void calculateGPA() {
        SemesterGPA =  totalGPA / countClass;
    }

    public String toString() {
        return "\n"+FirstName+" "+MiddleInitial+". "+LastName+"\n"+
                Classification+"\n"+
                "Semester GPA: "+SemesterGPA+"\n"+
                Class1+"\t"+Class1_Letter+"\n"+
                Class2+"\t"+Class2_Letter+"\n"+
                Class3+"\t"+Class3_Letter+"\n"+
                Class4+"\t"+Class4_Letter+"\n"+
                Class5+"\t"+Class5_Letter+"\n"+
                Class6+"\t"+Class6_Letter+"\n"+
                Class7+"\t"+Class7_Letter+"\n";
    }
}

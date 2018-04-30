package Student;

public class Student extends Person implements Comparable<Student> {
    private static int lastIdAssigned = 25000;
    private String myStudentId;
    private double myGpa, myNumberOfCredits;

    public Student(String first, String last) {
        super(first, last);
        myGpa = 0;
        myNumberOfCredits = 0;
        myStudentId = Integer.toString(lastIdAssigned + 1);
        lastIdAssigned++;
    }

    void addCourse(int credits, double grade) {
        myNumberOfCredits += credits;
        myGpa += grade;
    }

    public String getStudentId() {
        return myStudentId;
    }

    public double getGpa() {
        return myGpa;
    }

    public double getNumberOfCredits() {
        return myNumberOfCredits;
    }

    @Override
    public String toString() {
        return "First: "+getFirstName()+"\nLast: "+getLastName()+"\nEmail: "+getEmailAddress()+"\nGPA: "+getGpa()+
                "\nCredits: "+getNumberOfCredits()+"\nID: "+getStudentId();
    }

    @Override
    public int compareTo(Student student) {
        // return -1 if st has higher GPA, return 1 if otherwise
        // return 0 if GPAs are the same
        if (getGpa() < student.getGpa())
            return -1;
        else if (getGpa() > student.getGpa())
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Student s = new Student("Jon", "Ross");
        Student t = new Student("Jack", "Harris");
        t.addCourse(1,-4.0);
        System.out.println(s.toString());
        System.out.println(t.toString());
        System.out.println(s.compareTo(t));
    }
}

package Student;

public class Person {
    private String myFirstName;
    private String myLastName;
    private String myEmailAddress;

    public Person(String first, String last) {
        myFirstName = first;
        myLastName = last;
        if (last.length() > 5)
            myEmailAddress = first.substring(0,1)+last.substring(0,5)+"@jc.com";
        else
            myEmailAddress = first.substring(0,1)+last+"@jc.com";
    }

    public String getFirstName() {
        return myFirstName;
    }

    public String getLastName() {
        return myLastName;
    }

    public String getEmailAddress() {
        return myEmailAddress;
    }

    @Override
    public String toString() {
        return "First: "+getFirstName()+"\nLast: "+getLastName()+"\nEmail: "+getEmailAddress();
    }
}

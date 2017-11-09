/*
Write a class definition for Date, an object type that contains three integers: year, month, and day. This class should
provide two constructors. The first should take no parameters and initialize a default date. The second should take
parameters named year, month and day, and use them to initialize the instance variables.
Write a main method that creates a new Date object named birthday. The new object should contain your birth date. You
can use either constructor.
*/

package Date;

public class Date {
    private int year, month, day;        //Define class variables

    //Constructor for a default date
    public Date() {
        year = 2000;
        month = 1;
        day = 1;
    }

    //Constructor for custom date
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Getters and Setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return "Date: "+month+"/"+day+"/"+year;
    }
}
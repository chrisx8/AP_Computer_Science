package Date;

public class Birthday {
    public static void main(String[] args) {
        //Create object for default date
        Date defaultDate = new Date();

        //Set year, month, day in defaultDate
        defaultDate.setYear(2010);
        defaultDate.setMonth(12);
        defaultDate.setDay(30);
        //Print defaltDate string
        System.out.println(defaultDate.toString());

        //Create object 'birthday'
        Date birthday = new Date(2001,2,23);
        //Print birthday string
        System.out.println(birthday.toString());
    }
}

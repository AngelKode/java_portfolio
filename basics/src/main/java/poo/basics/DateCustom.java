package poo.basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCustom {
    public static void main(String[] args) {
        Date date = new Date();

        //Parsing date
        SimpleDateFormat formattedDate = new SimpleDateFormat("EEE, d MMM yyyy");

        System.out.println(formattedDate.format(date));

        //Calendar
        Calendar myCalendar = Calendar.getInstance();

        //Set specific date
        myCalendar.set(2024,Calendar.FEBRUARY,15);
        myCalendar.set(Calendar.MONTH, Calendar.DECEMBER);
        myCalendar.set(Calendar.YEAR, 2020);
        Date myDate = myCalendar.getTime();

        System.out.println(myDate);

        //Compare different dates
        myCalendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        myCalendar.set(Calendar.DATE,1);
        Date dateOne = myCalendar.getTime();

        myCalendar.set(Calendar.MONTH, Calendar.JANUARY);
        myCalendar.set(Calendar.DATE, 2);
        Date dateTwo = myCalendar.getTime();

        if(dateTwo.compareTo(dateOne) < 0){
            System.out.println(formattedDate.format(dateTwo) + " is not sooner than " + formattedDate.format(dateOne));
            System.exit(1);
        }

        if(dateTwo.compareTo(dateOne) > 0){
            System.out.println(formattedDate.format(dateTwo) + " is sooner than " + formattedDate.format(dateOne));
            System.exit(1);
        }

        System.out.println("Both dates are equal");

    }
}

package Dates;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyGregorianCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Year : " + calendar.get(Calendar.YEAR));
        System.out.println("Date : " + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.YEAR));

        System.out.println("time : " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("Month: " + months[calendar.get(Calendar.MONTH)]);
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        calendar.set(Calendar.YEAR, 1989);
        calendar.set(calendar.get(Calendar.YEAR), 0, 7);
        System.out.println("New Date : " + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.YEAR));
        System.out.println(calendar.getTime());

        //The Gregorian Calendar
        GregorianCalendar gcal = new GregorianCalendar(2022, 3, 21);
        System.out.println(gcal.get(Calendar.MONTH));


    }

}

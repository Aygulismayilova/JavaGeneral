package Dates;

import java.util.Date;

public class DateObject {
    public static void main(String[] args) {
        /*Date rightNow = new Date(735450600000l);
        System.out.println(rightNow);*/
        Date rightNow1 = new Date();
        Date birthdate=new Date(1646996791694l);
        birthdate.setTime(1646996879989l);
        System.out.println(rightNow1.after(birthdate));
        System.out.println(rightNow1);
        System.out.println(rightNow1.getTime());
        System.out.println(birthdate.compareTo(rightNow1));
        System.out.println(rightNow1.compareTo(birthdate));

    }
}
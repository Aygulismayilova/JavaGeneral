enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY


}


public class Enumerations {
    public static void main(String[] args) {
//enumuration is a collection of constants.

        Days daysArray[]=Days.values();
        for (int i=0;i<daysArray.length;i++){
            System.out.println(daysArray[i]);
        }
        System.out.println(Days.valueOf("MONDAY"));
        Days day2;
        day2=Days.valueOf("FRIDAY");
        day2=Days.FRIDAY;
        System.out.println(day2);



     /*   Days day1 = Days.MONDAY;
        if (day1 == Days.THURSDAY) {
            System.out.println("The day is Thursday");
        } else if (day1 == Days.MONDAY) {
            System.out.println("The day is Monday");
        }

        switch (day1){
            case MONDAY:
                System.out.println("Monday");
                break;
            case WEDNESDAY:
                System.out.println("Thursday");

        }
        System.out.println(Days.MONDAY);
        //values,valueOf methods
*/
    }
}

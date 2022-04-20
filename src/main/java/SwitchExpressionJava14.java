enum VehicleType {CAR, TRUCK, TRAIN, MOTORCYCLE, PLANE}

public class SwitchExpressionJava14 {
    //switch expression in a method
    public static int findNumberFromDay(String dayOfTheWeek2) {
        return switch (dayOfTheWeek2) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            case "Sunday" -> 7;
            default -> 0;
        } + 2;

    }

    public static void main(String[] args) {

        //
        String dayOfTheWeek2 = "Tuesday";
        final int result2 = findNumberFromDay(dayOfTheWeek2);
        System.out.println("Day of week is " + dayOfTheWeek2 + " " + result2);


        String dayOfTheWeek = "Wednesday";
        int result;//mutable variable can change. we want to aim for immutable
        switch (dayOfTheWeek) {
            case "Monday":
                result = 1;
                break;
            case "Tuesday":
                result = 2;
                break;
            case "Wednesday":
                result = 3;
                break;
            case "Thursday":
                result = 4;
                break;
            case "Friday":
                result = 5;
                break;
            case "Saturday":
                result = 6;
                break;
            case "Sunday":
                result = 7;
                break;
            default:
                result = 0;
                break;
        }

        //switch expression
        System.out.println("The day of the week as a number  " + result);


        final int result3 = switch (dayOfTheWeek) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            case "Sunday" -> 7;
            default -> 0;
        };
        System.out.println("Day of week is " + dayOfTheWeek + " " + result3);

        VehicleType vehicle1 = VehicleType.PLANE;
        //switch statement first not switch expression
        switch (vehicle1) {
            case CAR:
                System.out.println("VROOM VROOM IT is a Car");
                break;
            case TRUCK:
                System.out.println("It is a truck");
                break;
            case TRAIN:
                System.out.println("CHOO CHOo , it is a train");
                break;
            case PLANE:
                System.out.println("It is a plane");
                break;
            case MOTORCYCLE:
                System.out.println("It is a motorcycle");
                break;
        }

        //Now switch expression
        VehicleType vehicle2 = VehicleType.TRAIN;
        switch (vehicle2) {
            case CAR -> System.out.println("VROOM VROOM IT is a Car");

            case TRUCK -> {
                System.out.println("It is a truck");
                System.out.println("truck is exciting");
            }
            case TRAIN -> System.out.println("CHOO CHOo , it is a train");

            case PLANE -> System.out.println("It is a plane");

            case MOTORCYCLE -> System.out.println("It is a motorcycle");


        }
        String dayOfTheWeeks = "Thursday";
        int number =
                switch (dayOfTheWeeks) {
                    case "Monday" -> {
                        System.out.println("Mondays are great");
                        yield 1;
                    }//yield is an equialent of break statement but also returns a value;
                    case "Tuesday" -> {
                        yield 2;
                    }
                    case "Wednesday", "Thursday" -> 3;
                    case "Friday" -> 5;
                    case "Saturday" -> 6;
                    case "Sunday" -> 7;
                    default -> 0;
                };
        System.out.println(dayOfTheWeeks + " " + number);
    }
    //Java 14 switch expresions
    /*Features of swtich expressions:
     * 1.can be used as an expression
     * 2.No need for break statements
     * 3.Arrow syntax - (Lambda -like syntax)
     * 4.Multiple cases per line
     * 5.Yield keyword to replace break when returning a value
     *expression returns a value from itself like 2+2
     * statement
     *
     * */
}

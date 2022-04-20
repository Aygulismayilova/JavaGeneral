interface FunctionalInterface {
    //int giveNumber();
    double giveResult(double a, double b);

}

public class LambdaExpressions {
    public static void main(String[] args) {

        FunctionalInterface adding = (double a, double b) -> a * b;
        System.out.println(adding.giveResult(9.7, 9));
        FunctionalInterface subtracting = (double a, double b) -> a - b;
        System.out.println(subtracting.giveResult(78, 90));


/*
//()->
FunctionalInterface interface1;
interface1 = () -> 123;
System.out.println(interface1.giveNumber());

FunctionalInterface interface2;interface2 = () -> 123 * 5;
//   interface2=()->interface1.giveNumber();
System.out.println(interface2.giveNumber());
*/


    }
}

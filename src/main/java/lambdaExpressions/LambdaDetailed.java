package lambdaExpressions;

@FunctionalInterface
interface Thing {
    int doSomething(int a, int b);
}

public class LambdaDetailed {
    public static void main(String[] args) {
        //Variable capture
        int age = 48;
        Thing thingthing = (a, b) -> {
            return a + b + age;

        };
        //local variable captured by lambda expression is effectively final.
        //it means this variable cannot be modified inside or outside of lambda expression
        //only local variables are captured.  static variables and member variables those will not captured






  /*      Thing thing1 = new Thing() {
            @Override
            public int doSomething(int a, int b) {
                return a + b;
            }

        };
        System.out.println(thing1.doSomething(1, 56)
        );

        Thing thing2 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(thing2.doSomething(4, 5));
        //improving lambda
        Thing thing3 = (int a, int b) -> a + b;
        System.out.println(thing3.doSomething(45, 88));

        Thing thing4 = (a, b) -> a + b;
        System.out.println(thing4.doSomething(4, 5));

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        numbers.forEach(number -> System.out.println(number));


        List<Integer> numbers2 = Arrays.asList(2, 4, 6, 8, 10);
        numbers2.forEach(System.out::println);



        List<Integer> numbers3 = Arrays.asList(2, 4, 6, 8, 10);
        numbers3.forEach(number -> String.valueOf(number));


        List<Integer> numbers4 = Arrays.asList(2, 4, 6, 8, 10);
        numbers4.forEach(String::valueOf);
        numbers4.forEach(Integer::byteValue);*/

    }
}

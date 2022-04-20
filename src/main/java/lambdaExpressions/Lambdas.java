package lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 56, 675, 6, 43, 22);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 25) {
                System.out.println(numbers.get(i));
            }
        }
        for (int number : numbers) {
            if (number > 25) {
                System.out.println(number);
            }
        }

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                if (number > 25) {
                    System.out.println(number);
                }
            }
        });


        numbers.forEach((number) -> {
            if (number > 25) {
                System.out.println(number);
            }
        });


        numbers.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer number) {
                        if (number > 25) {
                            return true;
                        }
                        return false;
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer number) {
                        System.out.println(number);
                    }
                });


        //now using lambda expression

        numbers.stream()
                .filter((number) -> (number > 25))
                .forEach(System.out::println);

        //Predicate represents condition
        //functional interface is a way to declare a vary general m method(accept) that does sth you have define
        //
        //        numbers.forEach(); Consumer isa functional interface provided by java api.
    }
    //Lambda is a way for shortening functional interface
    //functional interface is an interface with one abstract method.
    //functional programming
    //for streams



    /*
     * Imperative programming vs declarative programming
     * imperative how o do and what to do
     *
     * declarative p. we are cutting out how to do it and what to do it
     * let higher order functions do
     * for example, we are telling it to stream and filter this, and print it out
     *the whole idea is making the thing more concise
     *
     * */
}

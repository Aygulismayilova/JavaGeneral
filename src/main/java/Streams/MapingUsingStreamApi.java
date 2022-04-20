package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;

public class MapingUsingStreamApi {
    public static void main(String[] args) {
        //How to do mapping using java stream api
        //Mapping-Transforming one object into another

        int[] numbers = {13, 2, 3, 5, 123213, 31, 23};
        Arrays.stream(numbers)
                .mapToObj(number -> {
                    return String.valueOf(number);
                }).forEach(System.out::println);


        Arrays.stream(numbers).map(number -> number * 20).forEach(System.out::println);


        Arrays.stream(numbers).mapToDouble(value -> (double) value).forEach(System.out::println);

Arrays.stream(numbers).mapToObj(value -> (double)value).forEach(System.out::println);







/*
        List<String> names = List.of("Aygul", "Sahil", "Ramile", "Aise", "Fatih", "Fatime");
        names.stream()
                .map(name -> {
                    return name.length();
                }).forEach(System.out::println);

        names.stream().map(name -> name.length())
                .filter(num -> {
                            if (num > 4) {
                                return false;
                            } else {
                                return true;
                            }
                        }
                ).

                forEach(System.out::println);*/

    }
}

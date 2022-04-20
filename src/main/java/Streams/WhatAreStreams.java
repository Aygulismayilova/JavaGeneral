package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WhatAreStreams {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(17);
        numbers.add(50);
        Set<String> newNumbers = numbers.stream().filter(integer -> integer > 5)
                .map(String::valueOf)
                .collect(Collectors.toSet());

        System.out.println(newNumbers);


/*
      String[] names = {"Bob", "Joe", "Bob2"};
      Arrays.stream(names);
      Examples of gettng stream
      Stream.of(numbers).forEach(System.out::println);
      Stream.of(names).forEach(System.out::println);
      Stream.of(1.23, 5.6, 3, 4, 8, 9);*/

    }
}

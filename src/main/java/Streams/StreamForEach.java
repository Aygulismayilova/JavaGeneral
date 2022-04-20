package Streams;


import Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamForEach {
    public static void main(String[] args) {
        //loop through collection
        //stream api
        ArrayList<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Larry");
        names.add("Ricky");
        names.add("Pablo");
        names.add("Thomas");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println(" ");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(" ");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(" 4 ");
        //jdk 8 forEach method
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        // names.forEach(new Predicate<String>());
/*
*  Predicate represents condition
        functional interface is a way to declare a vary general m method(accept) that does sth you have define
        */
        System.out.println("LAMBDA");
        names.forEach(
                name -> {
                    System.out.println(name);
                });


        System.out.println("  ");
        names.forEach(name -> System.out.println(name));

        System.out.println("  ");
        names.forEach(System.out::println);

        System.out.println("Stream api");
        //here we ae opening a stream
        //stream is a containor that holds all of your elements that you want to iterarte through
        //on that stream we call for each operation and print out each element on that stream
        names.stream().forEach(name -> System.out.println(name));

        // regular for each uses Iterator behind the scenes
        // but for each in streams does not use iterator in the background,uses the steam itself to iterate through each element



    }


}



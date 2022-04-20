package Streams;

import Collections.ArrayLists;
import Collections.HashMaps;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilteringStreams {
    public static void main(String[] args) {

        HashSet<Human> humans = new HashSet<>();

        humans.add(new Human("Fatime", 5));
        humans.add(new Human("Aise", 2));
        humans.add(new Human("Fatih", 10));
        humans.add(new Human("Aygul", 24));
        humans.add(new Human("Zamin", 30));
        HashSet<Human> sortedHumans = (HashSet<Human>) humans.stream().filter(human -> human.getAge()<10).collect(Collectors.toSet());
        System.out.println(sortedHumans);









     /*   ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(new Random().nextInt());
        }
        System.out.println(numbers);
        numbers.stream().filter(number -> number > 0 && (number % 2 == 0)).forEach(System.out::println);

*/
        //Filter -sort stuff
     /*   List<String> emilySucks = Arrays.asList("Jon", "Aygul", "Sahil", "Ramile", "Aise", "Fatih", "Fatime", "Zamin");
        emilySucks.stream().filter(name -> name.length() <= 4).forEach(System.out::println);
    */    /*new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.length() > 4) {
                    return true;

                } else {
                    return false;
                }
            }
        })*/
    }
}

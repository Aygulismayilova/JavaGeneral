package Streams;

import java.util.Arrays;
import java.util.List;

public class AnimalStream {
    public static void main(String[] args) {
        List<Racoon> chunkBois = Arrays.asList(new Racoon("Babic", 100.0, 20, 5),
                new Racoon("Henry", 90.0, 14, 6),
                new Racoon("Noon", 30.0, 78, 90),
                new Racoon("Mister Ben", 89.6, 10, 5)
        );
        chunkBois.stream().map(racoon -> (Animal) racoon)
                .mapToDouble(Animal::getHealth)
                // .map(Animal::getHealth)
                .forEach(System.out::println);
    }
}

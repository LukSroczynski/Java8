package java8.java.brains.iteration;

import java8.java.brains.EXERCISES.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Lukasz S. on 07.05.2017.
 */
public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Jack", "Morgan", 47),
                new Person("Adam", "Morris", 23),
                new Person("Peter", "Cegooop", 12),
                new Person("Sonmez", "Abape", 67),
                new Person("Megan", "Floran", 87)
        );

        for (Person e : people) {
            System.out.println("Normal loop : "+ e);
        }

        people.forEach(p -> System.out.println("Java8 loop : " + p));

        people.forEach(System.out::println);

    }
}

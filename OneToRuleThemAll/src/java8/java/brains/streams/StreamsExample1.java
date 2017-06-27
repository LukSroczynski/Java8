package java8.java.brains.streams;

import java8.java.brains.EXERCISES.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Lukasz S. on 08.05.2017.
 */
public class StreamsExample1 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jack", "Morgan", 47),
                new Person("Adam", "Morris", 23),
                new Person("Peter", "Cegooop", 12),
                new Person("Sonmez", "Abape", 67),
                new Person("Megan", "Floran", 87)
        );

        people.stream()
                .filter(person -> person.getFirstname().startsWith("M"))
                .forEach(person -> System.out.println(person.getLastname()));

        long count = people.parallelStream()
        .filter(person -> person.getLastname().startsWith("F"))
        .count();

        System.out.println(count);

    }
}

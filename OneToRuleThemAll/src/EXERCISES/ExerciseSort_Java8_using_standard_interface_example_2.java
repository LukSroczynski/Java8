package EXERCISES;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by Lukasz S. on 04.05.2017.
 */
public class ExerciseSort_Java8_using_standard_interface_example_2 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jack", "Morgan", 47),
                new Person("Adam", "Morris", 23),
                new Person("Peter", "Cegooop", 12),
                new Person("Sonmez", "Abape", 67),
                new Person("Megan", "Floran", 87)
        );

        /**
         * Java 8
         */

        // 1. Sort List by LastName
        Collections.sort(people, (Person o1, Person o2) -> o1.getLastname().compareTo(o2.getLastname()));

        // 2. Create a method that prints all elements in the List
        System.out.println("----------------------------------");
        performConditionally(people, p -> true, p -> System.out.println(p));

        // 3. Create a method that prints all people that have LastName beginning with C
        System.out.println("----------------------------------");
        performConditionally(people, p -> p.getLastname().startsWith("C"), p -> System.out.println(p));

        // 4. Create a method that prints all people that have LastName beggining with given letter
        System.out.println("----------------------------------");
        performConditionally(people, p -> p.getLastname().startsWith("M"), p -> System.out.println(p.getFirstname()));

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person e : people) {
            if (predicate.test(e))
                consumer.accept(e);
        }
    }
}

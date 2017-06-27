package java8.java.brains.references;

import java8.java.brains.EXERCISES.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by Lukasz S. on 07.05.2017.
 */
public class MethodReferenceExample2 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jack", "Morgan", 47),
                new Person("Adam", "Morris", 23),
                new Person("Peter", "Cegooop", 12),
                new Person("Sonmez", "Abape", 67),
                new Person("Megan", "Floran", 87)
        );

        printConditionally(people, p -> true, System.out::println); // method without parameters can be called like that
    }

    private static void printMessage() {
        System.out.println("Hello World!");
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person e : people) {
            if (predicate.test(e))
                consumer.accept(e);
        }
    }
}

package java8.java.brains.EXERCISES;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Lukasz S. on 04.05.2017.
 */
public class ExerciseSort_Java7 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jack", "Morgan", 47),
                new Person("Adam", "Morris", 23),
                new Person("Peter", "Cegooop", 12),
                new Person("Sonmez", "Abape", 67),
                new Person("Megan", "Floran", 87)
        );

        /**
         * Java 7
         */

        // 1. Sort List by LastName
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        });

        // 2. Create a method that prints all elements in the List
        System.out.println("----------------------------------");
        printAll(people);

        // 3. Create a method that prints all people that have LastName beginning with C
        System.out.println("----------------------------------");
        printLastNamesBeginningWithC(people);

        // 4. Create a method that prints all people that have LastName beggining with given letter
        System.out.println("----------------------------------");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastname().startsWith("M");
            }
        });
    }

    private static void printLastNamesBeginningWithC(List<Person> people) {
        for (Person e : people) {
            if (e.getLastname().startsWith("C"))
                System.out.println(e);
        }
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person e : people) {
            if (condition.test(e))
                System.out.println(e);
        }
    }

    private static void printAll(List<Person> people) {
        for (Person e : people) {
            System.out.println(e);
        }
    }
}
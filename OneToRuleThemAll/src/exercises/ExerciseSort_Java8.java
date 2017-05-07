package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Lukasz S. on 04.05.2017.
 */
public class ExerciseSort_Java8 {
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
        printConditionally(people, p -> true);

        // 3. Create a method that prints all people that have LastName beginning with C
        System.out.println("----------------------------------");
        printConditionally(people, p -> p.getLastname().startsWith("C"));

        // 4. Create a method that prints all people that have LastName beggining with given letter
        System.out.println("----------------------------------");
        printConditionally(people, p -> p.getLastname().startsWith("M"));

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person e : people) {
            if (condition.test(e))
                System.out.println(e);
        }
    }
}

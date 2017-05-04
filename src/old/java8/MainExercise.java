package old.java8;

import java.util.*;

/**
 * Created by Lukasz S. on 06.04.2017.
 *
 * Boilerplate code compare
 */
public class MainExercise {
    public static void main(String[] args) {

        List<Person> peopleJava7 = Arrays.asList(
                new Person("Jack", "Last", 32),
                new Person("Miranda", "Corral", 43),
                new Person("Thomas", "Carol", 65),
                new Person("Charlotte", "Jahaha", 34),
                new Person("Mark", "Arteh", 56)
        );

        List<Person> peopleJava8 = Arrays.asList(
                new Person("Jack", "Last", 32),
                new Person("Miranda", "Corral", 43),
                new Person("Thomas", "Carol", 65),
                new Person("Charlotte", "Jahaha", 34),
                new Person("Mark", "Arteh", 56)
        );

        /**
         * Java7 implementation
         */

        System.out.println("Java 7 - Solution\n\n");

        // 1. Sort list by Last Name
        Collections.sort(peopleJava7, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        // 2. Create a method that prints all elements in the list
        System.out.println("All Person objects");
        printConditionally(peopleJava7, new Condition() {
            @Override
            public boolean test(Person p) {
                return true;
            }
        });

        // 3. Create a method that prints all people that have last name beginning with C
        System.out.println("Person Last Names that starts with C");
        printConditionally(peopleJava7, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("Person First Names that starts with C");
        printConditionally(peopleJava7, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });

        /**
         * Java8 implementation
         */

        System.out.println("\n\n Java 8 - Solution \n\n");

        // 1. Sort list by Last Name
        Collections.sort(peopleJava8, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        // 2. Create a method that prints all elements in the list
        System.out.println("All Person objects");
        printConditionally(peopleJava8, p -> true);

        // 3. Create a method that prints all people that have last name beginning with C
        System.out.println("Person Last Names that starts with C");
        printConditionally(peopleJava8, p -> p.getLastName().startsWith("C"));

        System.out.println("Person First Names that starts with C");
        printConditionally(peopleJava8, p -> p.getFirstName().startsWith("C"));
    }

    private static void printConditionally(List<Person> list, Condition condition) {
        System.out.println("----------------------------------------------");
        for(Person p : list) {
            if(condition.test(p))
                System.out.println(p);
        }
        System.out.println("--------------------------------");
    }
}
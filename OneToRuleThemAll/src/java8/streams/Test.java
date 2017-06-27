package java8.streams;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Lukasz S. on 27.06.2017.
 */
public class Test {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();

        list1.add(new Student("Zack1", "Zosoan", "43"));
        list1.add(new Student("Mack", "Loaoas", "23"));
        list1.add(new Student("Antony", "Astoniss", "35"));
        list1.add(new Student("Moloon", "Salalr", "29"));

        List<String> list2 =
                Arrays.asList("y1", "a2", "a3");

        list2.stream()
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of(
                new Student("Zack1", "Zosoan",
                        "43"), new Student("Antony", "Quill", "32"))
        .findFirst()
        .ifPresent(student -> System.out.println(student.getName()));

    }
}

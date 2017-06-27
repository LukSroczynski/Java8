package java8.java.brains.stuff;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Lukasz S. on 11.05.2017.
 */
public class Sample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

//        values.forEach(System.out::print);

        System.out.println(
                values.stream()
                .map(e -> e * 2)
                .reduce(0, (integer, integer2) -> integer + integer2));

    }
}

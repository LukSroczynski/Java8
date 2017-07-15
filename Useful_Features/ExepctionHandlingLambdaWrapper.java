package execption.handling.in.lambda;

import java.util.function.BiConsumer;

/**
 * Created by Lukasz S. on 07.05.2017.
 */
public class ExepctionHandlingLambdaWrapper {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int key = 0;

        process(numbers, key, wrapperLambda((integer, integer2) -> System.out.println(integer / integer2)));

    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numbers) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (integer, integer2) -> {
            try {
                consumer.accept(integer, integer2);
            } catch (ArithmeticException ex) {
                System.out.println("Exeption inside lambda wrapper");
            }
        };
    }
}

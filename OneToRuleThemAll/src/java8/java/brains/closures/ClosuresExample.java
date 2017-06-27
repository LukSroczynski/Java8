package java8.java.brains.closures;

/**
 * Created by Lukasz S. on 07.05.2017.
 */
public class ClosuresExample {
    public static void main(String[] args) {

        int value1 = 100;
        int value2 = 212;

        doProcess(value1, i -> System.out.println(i + value2));

    }

    public static void doProcess(int i, Process process) {

        process.process(i);
    }
}

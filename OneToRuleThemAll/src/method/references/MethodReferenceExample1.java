package method.references;

/**
 * Created by Lukasz S. on 07.05.2017.
 */
public class MethodReferenceExample1 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(MethodReferenceExample1::printMessage); //  // method without parameters can be called like that

        Thread thread2 = new Thread(() -> printMessage());

        thread1.start();
        thread2.start();
    }

    private static void printMessage() {
        System.out.println("Hello World!");
    }
}

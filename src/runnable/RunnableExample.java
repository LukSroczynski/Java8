package runnable;

/**
 * Created by Lukasz S. on 06.04.2017.
 */

public class RunnableExample {
    public static void main(String[] args) {

        Thread customThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        customThread1.run();

        /**
         * That exmaple shows us why they made lambda to reference interface.
         * They added lambda and because of that didn't need to change anything. Because Thread have only one method inside it's compatible with Lambda
         */

        Thread customThread2 = new Thread(() -> System.out.println("Printed inside lambda runnable"));
        customThread2.run();

    }
}

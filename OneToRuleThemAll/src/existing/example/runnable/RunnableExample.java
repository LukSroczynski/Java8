package existing.example.runnable;

/**
 * Created by Lukasz S. on 04.05.2017.
 */
public class RunnableExample {
    public static void main(String[] args) {

        /**
         * Here is an example of implementation of Runnable
         */
        Thread innerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inner Runnable performed!");
            }
        });

       innerThread.run();

        /**
         * Here we just using lambda which results in less boilerplate code
         * */
       Thread lambdaThread = new Thread(() -> System.out.println("Lambda Runnable performed!"));
       lambdaThread.run();

    }
}


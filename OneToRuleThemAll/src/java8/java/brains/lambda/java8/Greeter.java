package java8.java.brains.lambda.java8;

import java8.java.brains.lambda.interfaces.Greeting;

/**
 * Created by Lukasz S. on 04.05.2017.
 */
public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        Greeting innerGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inner Hello!");
            }
        };

        greeter.greet(innerGreeting);

        // So lambda is basically a shortcut for creating annonymous inner classes
        // BUT not exacly true, there are thing that inner class does which is different from what lambda do
        Greeting lambdaGreeting = () -> System.out.println("Hello!");

        greeter.greet(lambdaGreeting);
    }
}

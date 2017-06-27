package java8.java.brains.lambda.java7;


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
        GreetingImpl greeting = new GreetingImpl();
        greeter.greet(greeting);

        Greeting innerGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inner Hello!");
            }
        };

        innerGreeting.perform();

    }
}

package old.lambda;

/**
 * Created by Lukasz S. on 05.04.2017.
 *
 * Type Inference -
 *
 */
public class Greeter {

    void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {

        GreetingImpl greeting = new GreetingImpl();
        Greeting lambdaPrint = () -> System.out.println("Hello Mars !");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {

                System.out.println("Anonymous inner class");
            }
        };

        greeting.perform();
        lambdaPrint.perform();
        innerClassGreeting.perform();

        Greeter greeter = new Greeter();
        greeter.greet(lambdaPrint);


    }
}
package current.oop.vs.lambda.java8;

/**
 * Created by Lukasz S. on 04.05.2017.
 */
public class Greeter {

    public void greet(LambdaGreeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {

        LambdaGreeting lambdaGreeting = () -> System.out.println();
    }
}

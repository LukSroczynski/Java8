package difference.inteface.lambda;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public class Greeter {

    void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {

        GreetingImpl greeting = new GreetingImpl();
        Greeting lambdaPrint = () -> System.out.println("Hello Mars !");

        Greeting greeting1 = new Greeting() {
            @Override
            public void perform() {

                System.out.println("anonymous inner class");
            }
        }

        greeting.perform();
        lambdaPrint.perform();

    }
}
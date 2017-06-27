package java8.java.brains.lambda.java7;


import java8.java.brains.lambda.interfaces.Greeting;

/**
 * Created by Lukasz S. on 04.05.2017.
 */
public class GreetingImpl implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello!");
    }
}

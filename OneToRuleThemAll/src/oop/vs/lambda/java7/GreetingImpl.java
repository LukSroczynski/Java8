package oop.vs.lambda.java7;


import oop.vs.lambda.interfaces.Greeting;

/**
 * Created by Lukasz S. on 04.05.2017.
 */
public class GreetingImpl implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello!");
    }
}

package difference.inteface.lambda;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public class GreetingImpl implements Greeting{
    @Override
    public void perform() {
        System.out.println("Hello World!");
    }
}

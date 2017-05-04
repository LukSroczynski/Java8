package multiple.methods.functional.Interface.interfaces;

/**
 * Created by Lukasz S. on 04.05.2017.
 */

@FunctionalInterface
public interface Greeting {
    void perform();

    default void another() {
        System.out.println("Another");
    }
}

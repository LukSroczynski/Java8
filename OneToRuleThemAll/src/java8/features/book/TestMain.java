package java8.features.book;


/**
 * Created by Lukasz S. on 27.06.2017.
 */
public class TestMain {

    Runnable r1 = () -> System.out.println(this);

  	Runnable r2 = () -> System.out.println(toString());

    Runnable r3 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Before Java8: " + TestMain.this);
        }
    };

    public String toString() { return "Hello, world!!"; }

    public static void main(String... args) {
        new TestMain().r1.run(); //Hello, world!
        new TestMain().r2.run(); //Hello, world!
        new TestMain().r3.run(); //Hello, world!
    }


}

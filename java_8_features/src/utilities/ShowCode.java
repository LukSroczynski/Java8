package utilities;

import model.Humanoid;

import java.util.List;

/**
 * Created by Surrealistic on 15/07/2017.
 */
public class ShowCode<T extends Humanoid> {

    private T t;

    private T getT() {
        return this.t;
    }

    private void printObject(List<T> objects, String message) {
        for (T obj : objects) {
            System.out.print(message + "||  ");
            System.out.println(obj.getName() +" of age "+ obj.getAge());
        }
    }

    private void printObject(List<T> objects) {
        for (T obj : objects) {
            System.out.println(obj.getName() +" of age "+ obj.getAge());
        }
    }
}

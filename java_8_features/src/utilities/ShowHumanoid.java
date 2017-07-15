package utilities;

import model.Humanoid;

import java.util.List;

/**
 * Created by Surrealistic on 15/07/2017.
 */
public class ShowHumanoid<T extends Humanoid> {

    private T t;

    private T getT() {
        return this.t;
    }

    public void printHumanoidObject(List<T> objects, String message) {
        for (T obj : objects) {
            System.out.print("Msg: "+ message + "  ");
            System.out.println(obj.getName() +" of age "+ obj.getAge());
        }
    }

    public void printHumanoidObject(List<T> objects) {
        for (T obj : objects) {
            System.out.println(obj.getName() +" of age "+ obj.getAge());
        }
    }
}

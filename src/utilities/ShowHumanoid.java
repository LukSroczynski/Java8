package utilities;

import model.Developer;
import model.Humanoid;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Surrealistic on 15/07/2017.
 */
public class ShowHumanoid<T extends Humanoid> {

    public void printHumanoidObject(List<? extends Humanoid> objects, String message) {

        objects.stream()
                .forEach(e -> System.out.printf(("Msg: (%s) %s of age %d\n"), message, e.getName(), e.getAge()));
    }

    public void printHumanoidObject(List<T> objects) {

        objects.stream()
                .forEach(e -> System.out.printf(("(%s) of age %d\n"), e.getName(), e.getAge()));
    }
}

package java7.sort.compare.objects;

import fake.database.DataAccess;
import model.Developer;
import utilities.ShowHumanoid;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Surrealistic on 13/07/2017.
 * Sort Objects without Lambda
 */
public class Test {

    // SAMPLE DATA - get list of devs
    static List<Developer> devs_list = DataAccess.get_developers();

    // Object for printing Humanoids
    static ShowHumanoid<Developer> humanoid = new ShowHumanoid<>();

    public static void main(String[] args) {

        /**
         *  Objects before sort
         */
        humanoid.printHumanoidObject(devs_list, "Before Sort");

        /**
         *                Sort by Age
         *          How does Compare works:
         *  return zero_value     ->  if objects are equal
         *  return positive_value ->  if object o1 > o2
         *  return negative_value ->  if object o1 < o2
         *
         */
        Collections.sort(devs_list, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        /**
         *  Objects sorted by age
         */
        humanoid.printHumanoidObject(devs_list, "After sort by age");

        /**
         *                Sort by Names
         *          How does Compare works:
         *  return zero_value     ->  if objects are equal
         *  return positive_value ->  if object o1 > o2
         *  return negative_value ->  if object o1 < o2
         *
         */
        Collections.sort(devs_list, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        /**
         *  Objects sorted by Name and by Age (before)
         */
        humanoid.printHumanoidObject(devs_list, "After sort by name");


    }
}

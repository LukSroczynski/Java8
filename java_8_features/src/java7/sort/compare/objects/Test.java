package java7.sort.compare.objects;

import fake.database.DataAccess;
import model.Developer;
import utilities.ShowHumanoid;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Surrealistic on 13/07/2017.
 * Sort Objects without Lambda
 */
public class Test {

    // get list of devs to work on - SAMPLE DATA
    static List<Developer> devs_list = DataAccess.get_developers();

    // create object for printing Humanoids
    static ShowHumanoid<Developer> humanoid = new ShowHumanoid<>();

    public static void main(String[] args) {

        // Objects before sort
        humanoid.printHumanoidObject(devs_list, "Before Sort");

        /**
         *               Sort by Age
         * Compare:
         *  return 0 -> if objects are equal
         *  return positive_value -> if object o1 > o2
         *  return negative_value -> if object o1 < o2
         */
        Collections.sort(devs_list, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // Objects sorted by age
        humanoid.printHumanoidObject(devs_list, "After sort");


    }




}

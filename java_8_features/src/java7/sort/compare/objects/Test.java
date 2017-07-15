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

    public static void main(String[] args) {

        // get list of devs to work on
        List<Developer> listDevs = DataAccess.get_developers();

        // Objects before sort
        for (Developer developer : listDevs) {
            System.out.print("Before Sort:\t");
            System.out.println(developer.getName() +" of age "+ developer.getAge());
        }

        /**
         *               Sort by Age
         * Compare:
         *  return 0 -> if objects are equal
         *  return positive_value -> if object o1 > o2
         *  return negative_value -> if object o1 < o2
         */
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // Objects sorted by age
        ShowHumanoid<Developer> developerShowCode = new ShowHumanoid<>();
        developerShowCode.printHumanoidObject(listDevs, "After sort");

        ShowHumanoid


    }




}

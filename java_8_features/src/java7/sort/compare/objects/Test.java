package java7.sort.compare.objects;

import data.DataAccess;
import model.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Surrealistic on 13/07/2017.
 * Sort Object without Lambda
 */
public class Test {

    public static void main(String[] args) {

        List<Developer> listDevs = DataAccess.getDevelopers();


        for (Developer developer : listDevs) {
            System.out.print("Before Sort: ");
            System.out.println(developer.getName());
        }

        //sort by age
        Collections.sort(listDevs, new Comparator<Developer>() {


            // return 0 - if objects are equal
            // return positive value if o1 is greater than o2
            // return negative value if o1 is less
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Developer developer : listDevs) {
            System.out.print("After Sort: ");
            System.out.println(developer.getName());
        }

    }


}

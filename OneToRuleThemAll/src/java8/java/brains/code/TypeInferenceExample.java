package java8.java.brains.code;

import java8.java.brains.code.interfaces.StringLengthOfTwo;
import java8.java.brains.code.interfaces.StringLength;

/**
 * Created by Lukasz S. on 04.05.2017.
 * inference - wnioskowanie, wniosek, konkluzja
 */
public class TypeInferenceExample {
    public static void main(String[] args) {

        StringLength stringLength = s -> s.length();

        StringLengthOfTwo stringLengthOfTwo = (s1, s2) -> s1.length() + s2.length();

        System.out.println(stringLength.getString(" b r o o o m "));

        System.out.println(stringLengthOfTwo.getString("ONE", "X"));

    }
}

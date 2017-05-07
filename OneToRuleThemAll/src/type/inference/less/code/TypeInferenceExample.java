package type.inference.less.code;

import type.inference.less.code.interfaces.StringLength;
import type.inference.less.code.interfaces.StringLengthOfTwo;

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

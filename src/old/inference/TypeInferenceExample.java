package old.inference;

/**
 * Created by Lukasz S. on 06.04.2017.
 *
 * Type Inference - it's important to figure out what type of lambda it is
 */
public class TypeInferenceExample {
    public static void main(String[] args) {

        StringLengthLambda lengthLambda3 = (String s) -> s.length();
        System.out.println(lengthLambda3.getLength(" Long Lambda"));

        StringLengthLambda lengthLambda2 = (s) -> s.length();
        System.out.println(lengthLambda2.getLength(" Shortcut lambda "));

        StringLengthLambda lengthLambda1 = s -> s.length();
        System.out.println(lengthLambda1.getLength(" Biggest shortcut possible! "));

        printLambda(s -> s.length());

    }

    public static void printLambda(StringLengthLambda l) {
        System.out.println(l.getLength("Hello There. It's Lambda here."));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }

}

package java7.generics;


/**
 * Created by Surrealistic on 15/07/2017.
 */
public class Test {
    public static void main(String[] args) {

        /**
         *  Example of generic class paramaterized
         */
        Generics<String> generics1 = new Generics<>();
        generics1.setGeneric("Example of generic class");
        System.out.println(generics1.getGeneric());

        /**
         *  Example of generic class without paramaterized type
         *  It makes type Object - because of that we are gonna need to cast and that can produce runtime errors
         */
        Generics generics2 = new Generics();
        generics2.setGeneric("Example of generic class");
        System.out.println(generics2.getGeneric());

    }
}

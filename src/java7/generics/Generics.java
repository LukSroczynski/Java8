package java7.generics;

/**
 * Created by Surrealistic on 15/07/2017.
 * Generic in Java
 */

/**
 *
 * Generics added in Java5 to provide compile-time type checking and removing ClassCastException.
 *
 * Naming convention:
 * - E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
 * - K – Key (Used in Map)
 * - N – Number
 * - T – Type
 * - V – Value (Used in Map)
 * - S,U,V etc. – 2nd, 3rd, 4th types
 *
 *
 * Example implementation of generic class:
 * Generics<String> names = new Generics<>();
 *
 * @param <T>
 */
public class Generics <T> {

    private T t;


    public T getGeneric() {
        return t;
    }

    public void setGeneric(T t) {
        this.t = t;
    }
}
package Java_Programs._36_Generics;

import java.util.ArrayList;
import java.util.List;

/*
 * This class demonstrates the use of **Generics with List**.
 * Generics provide type safety and avoid runtime type casting issues.
 */
public class P189_Generics_List {

    public static void main(String[] args) {

        // Raw List (no generics)
        // Can store any type of object → NOT type-safe
        List rawList = new ArrayList();
        // Example: rawList can store Integer, String, Double, etc.

        // Generic List restricted to Integer values only
        List<Integer> integerList = new ArrayList<>();
        // Can store only Integer objects

        // Generic List restricted to String values only
        List<String> stringList = new ArrayList<>();
        // Can store only String objects

        // Generic List restricted to Double values only
        List<Double> doubleList = new ArrayList<>();
        // Can store only Double objects

        // Generic List restricted to Boolean values only
        List<Boolean> booleanList = new ArrayList<>();
        // Can store only Boolean objects
    }
}

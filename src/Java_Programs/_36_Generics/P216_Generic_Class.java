package Java_Programs._36_Generics;

/*
 * This class demonstrates a **generic class** with different data types.
 * The same class works for Integer, Double, and String using generics.
 */

/*
 * Generic class declaration
 * <T> allows this class to work with any reference data type
 */
class Test<T> {

    // Variable of generic type T
    T obj;

    /*
     * Constructor initializes the generic object
     */
    Test(T obj) {
        this.obj = obj; // assigns passed value to class variable
    }

    /*
     * Getter method to return the stored object
     */
    public T getObj() {
        return this.obj; // returns the stored value
    }
}

public class P216_Generic_Class {

    public static void main(String[] args) {

        // Creating Test object with Integer type
        Test<Integer> integerObj = new Test<>(5);
        System.out.println(integerObj.obj); // Output: 5

        // Creating Test object with Double type
        Test<Double> doubleObj = new Test<>(5.3);
        System.out.println(doubleObj.obj); // Output: 5.3

        // Creating Test object with String type
        Test<String> stringObj = new Test<>("Anuj");
        System.out.println(stringObj.obj); // Output: Anuj
    }
}

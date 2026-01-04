package Java_Programs._36_Generics;

/*
 * This class demonstrates the usage of a **generic class**.
 * GenericClass<T> can work with any reference data type.
 */
public class P188_Generic_Class {

    public static void main(String[] args) {

        // Creating a GenericClass object with Integer type
        GenericClass<Integer> intObject = new GenericClass<>(5);
        // intObject holds Integer value 5

        // Creating a GenericClass object with String type
        GenericClass<String> stringObject = new GenericClass<>("Anuj");
        // stringObject holds String value "Anuj"

        // T is a placeholder that can represent any reference data type
    }
}

/*
 * Generic class declaration
 * <T> is defined after the class name and can be used anywhere inside the class
 */
class GenericClass<T> {

    // Variable of generic type T
    private T data;

    /*
     * Constructor to initialize the generic data
     */
    public GenericClass(T data) {
        this.data = data; // assigns passed value to class variable
    }

    /*
     * Setter method to update data
     * No need to declare <T> again inside the class
     */
    public void setData(T data) {
        this.data = data; // updates the stored value
    }

    /*
     * Getter method to return data
     */
    public T getData() {
        return this.data; // returns the stored value
    }
}

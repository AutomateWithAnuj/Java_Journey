package Java_Programs._36_Generics;

/*
 * This class demonstrates a **generic method with multiple type parameters**.
 * T1, T2, and T3 can represent different data types.
 */
public class P217_Multiple_Generics_Demo {

    /*
     * Generic method declaration with three type parameters
     * <T1, T2, T3> allows passing three different types of values
     */
    public static <T1, T2, T3> void temp(T1 x, T2 y, T3 z) {

        // Prints first generic value
        System.out.println("This is x = " + x); // Output: This is x = 1

        // Prints second generic value
        System.out.println("This is y = " + y); // Output: This is y = 2

        // Prints third generic value
        System.out.println("This is z = " + z); // Output: This is z = 3
    }

    public static void main(String[] args) {

        // Method call with Integer values
        // Compiler automatically infers T1, T2, T3 as Integer
        temp(1, 2, 3);
    }
}

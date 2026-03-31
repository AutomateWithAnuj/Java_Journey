package Java_Programs._36_Generics;

/*
 * This class demonstrates a **generic method**.
 * The same method works with Integer, Double, and String.
 */
public class P187_Generics {

    /*
     * Generic method declaration
     * <T> declares type parameter for this method
     * T is used as parameter type and return type
     */
    static <T> T temp_sum(T a, T b) {

        // Prints first value
        System.out.println(a); // prints value of a

        // Prints second value
        System.out.println(b); // prints value of b

        // return a + b; 
        //compile-time error Because T does NOT know how to add (+) values. 
        //it can add int, double, string, but not any other custom type object
        
        // Addition logic for String
        if (a instanceof String && b instanceof String) {
            return (T) (((String) a) + ((String) b));
        }

        // Addition logic for Numbers
        if (a instanceof Number && b instanceof Number) {

            Double result = ((Number) a).doubleValue() + ((Number) b).doubleValue();
            return (T) result;
        }

        // If unsupported type
        System.out.println("Addition not supported for this type");
        return null;
    }

    public static void main(String[] args) {

        // Calling generic method with Integer values
        System.out.println(temp_sum(10, 20));
        // Output:
        // 10
        // 20
        // 30.0

        // Calling generic method with Double values
        System.out.println(temp_sum(3.5, 4.5));
        // Output:
        // 3.5
        // 4.5
        // 8.0

        // Calling generic method with String values
        System.out.println(temp_sum("Anuj", "Rajput"));
        // Output:
        // Anuj
        // Rajput
        // AnujRajput
    }
}

package Java_Programs._25_OOPs_Polymorphism.MethodOverloading;

/*
 * This class demonstrates Method Overloading
 * - Same method name: add()
 * - Different parameter lists
 * - Resolved at compile time
 */
class MathOperations {

    // Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adds two float values
    float add(float a, float b) {
        return a + b;
    }

    // Adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class P134_Poly_MethodOverloading {

    public static void main(String[] args) {

        // Creating object of MathOperations class
        MathOperations math = new MathOperations();

        // Calling overloaded add() methods
        int sum1 = math.add(2, 3);              // calls add(int, int)
        float sum2 = math.add(3.7f, 5.9f);      // calls add(float, float)
        int sum3 = math.add(2, 3, 4);            // calls add(int, int, int)

        // Printing results
        System.out.println("Sum of 2 integers        : " + sum1);
        System.out.println("Sum of 2 float numbers   : " + sum2);
        System.out.println("Sum of 3 integers        : " + sum3);
    }
}

package Java_Programs._25_OOPs_Polymorphism.MethodOverloading;

public class P084_ManyMain_Method_Overloading {

    /*
     * JVM always starts execution from this exact method signature:
     * public static void main(String[] args)
     *
     * Other main methods are NOT entry points.
     * They behave like normal overloaded static methods.
     */
    public static void main(String[] args) {

        System.out.println("JVM Entry Point: main(String[] args)");

        // Calling overloaded main methods explicitly
        main(10);        // calls main(int args)
        main(true);      // calls main(boolean args)
        main("Hello");   // calls main(String args)

        // Demonstrating switch usage (modern & readable)
        chooseMain(2);
    }

    // Overloaded main method with String parameter
    public static void main(String args) {
        System.out.println("Overloaded main(String args) called with value: " + args);
    }

    // Overloaded main method with int parameter
    public static void main(int args) {
        System.out.println("Overloaded main(int args) called with value: " + args);
    }

    // Overloaded main method with boolean parameter
    public static void main(boolean args) {
        System.out.println("Overloaded main(boolean args) called with value: " + args);
    }

    /*
     * Using switch to decide which overloaded main method to call
     * This makes the example more structured and realistic.
     */
    public static void chooseMain(int option) {

        switch (option) {
            case 1 -> main(100);
            case 2 -> main("Switch Call");
            case 3 -> main(false);
            default -> System.out.println("Invalid option");
        }
    }
}

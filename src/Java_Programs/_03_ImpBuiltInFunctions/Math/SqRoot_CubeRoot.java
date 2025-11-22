package Java_Programs._03_ImpBuiltInFunctions.Math;

public class SqRoot_CubeRoot {
    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 27;

        // Using built-in functions
        double squareRoot = Math.sqrt(num1);
        double cubeRoot = Math.cbrt(num2);

        System.out.println("Square root of " + num1 + " = " + squareRoot);
        System.out.println("Cube root of " + num2 + " = " + cubeRoot);
    }
}

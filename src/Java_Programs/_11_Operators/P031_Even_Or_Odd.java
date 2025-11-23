package Java_Programs._11_Operators;

public class P031_Even_Or_Odd {
    public static void main(String[] args) {

        int num = 10;  
        // We are checking if the number is even or odd

        // Ternary operator:
        // If num % 2 == 0 → "Even", otherwise → "Odd"
        String res = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(res);   // Output: Even
    }
}

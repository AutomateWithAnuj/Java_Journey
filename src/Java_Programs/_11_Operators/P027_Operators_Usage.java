package Java_Programs._11_Operators;
import java.lang.Math;

public class P027_Operators_Usage {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;
        int z = 10;

        // If z is negative, convert it to positive (absolute value logic)
        if(z < 0){
            z = z * -1;   // makes negative number positive
        }

        /*
         Math.cbrt() → finds cube root
         Expression: x*x + y*y - z
         Here: 10*10 + 10*10 - 10 = 100 + 100 - 10 = 190
         Cube root of 190 ≈ 5.758
        */
        System.out.println(Math.cbrt(x*x + y*y - z));  // Output: 5.758...
    }
}

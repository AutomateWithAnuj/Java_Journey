package Java_Programs._11_Operators;
import java.lang.Math;

public class P027_Operators_Usage {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 10;
        if(z < 0){
            z=z*-1;
        }
        System.out.println(Math.cbrt(x*x+y*y-z));
    }
}

package Java_Programs._35_Exceptions;

import java.util.Scanner;

public class P176_TryCatchFinally_Real {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int b = 10/v;
            System.out.println("Result: "+b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
            System.out.println("end of program sc is closed");
            //we need to close the sc no matter program got exception or not
        }
    }
}

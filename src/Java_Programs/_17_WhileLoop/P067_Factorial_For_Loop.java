package Java_Programs._17_WhileLoop;

import java.util.Scanner;

public class P067_Factorial_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //mutiply all the numbers from 1 to n
        int n = sc.nextInt();
        int f = 1;
        for (int i=n;i>=1;i--){
            f = f*i;
        }
        System.out.printf("Factorial of the %d is %d",n,f);
    }
}

package Java_Programs;

import java.util.Scanner;

public class P067_Factorial_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int f = 1;
        for (int i=n;i>=1;i--){
            f = f*i;
        }
        System.out.printf("Factorial of the %d is %d",n,f);
    }
}

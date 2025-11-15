package Java_Programs._17_WhileLoop;

import java.util.Scanner;

public class P070_Fibonacci_Sequence_Generator {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34

        int a = 0;   // first number
        int b = 1;   // second number
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many values you want: ");
        int NoOfvalues = sc.nextInt();

        int n = 1;

        while (n <= NoOfvalues) {
            if (n == 1) {
                System.out.print(a + ", ");  // print 0
            } else if (n == 2) {
                System.out.print(b + ", ");  // print 1
            } else {
                int temp = b;
                b = a + b;   // this is what the next Fibonacci value, which b must take
                a = temp; //don't change b now only replace a with old b
                System.out.print(b + ", ");
            }
            n++;
        }
    }
}

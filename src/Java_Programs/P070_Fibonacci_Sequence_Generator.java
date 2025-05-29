package Java_Programs;

import java.util.Scanner;

public class P070_Fibonacci_Sequence_Generator {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many values you want: ");
        int NoOfvalues = sc.nextInt();
        int n = 1;
        String s = "";
        while (n<=NoOfvalues){
            if(n==1){
                System.out.print("1, ");
            } else if (n==2) {
                System.out.print("1, ");
            } else {
                int temp = b;
                b = b+a;
                a = temp;
                System.out.printf("%d, ",b);
            }
            n++;
        }
    }
}

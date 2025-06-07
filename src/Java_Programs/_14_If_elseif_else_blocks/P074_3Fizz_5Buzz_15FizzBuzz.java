package Java_Programs._14_If_elseif_else_blocks;

import java.util.Scanner;

public class P074_3Fizz_5Buzz_15FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Fizz or Buzz: ");
        int n = sc.nextInt();
        if(n%3==0 && n%5==0) {
            System.out.println("Thanks it is a FizzBuzz");
        } else if(n%3==0){
            System.out.println("Thanks it is a Fizz");
        } else if (n%5==0) {
            System.out.println("Thanks it is a Buzz");
        } else {
            System.out.println("Sorry it's neither Fizz Nor Buzz");
        }
    }
}

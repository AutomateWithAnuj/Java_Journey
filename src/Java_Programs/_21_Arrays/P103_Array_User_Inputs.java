package Java_Programs._21_Arrays;

import java.util.Scanner;

public class P103_Array_User_Inputs {
    public static void main(String[] args) {

        // *** Method 1: Using Command Line Arguments ***
        int[] marks2 = new int[5];
        
        for (int i = 0; i < marks2.length; i++) {
            marks2[i] = Integer.parseInt(args[i]); // converting String input to int
        }

        System.out.print("Values using CLI: ");
        for (int i = 0; i < marks2.length; i++) {
            System.out.print(marks2[i] + " ");
        }

        System.out.println(); // For line spacing

        // *** Method 2: Using Scanner Class ***
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Enter value for index %d: ", i);
            marks[i] = sc.nextInt(); // reading integer input from user
        }

        System.out.print("Values using Scanner: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        sc.close(); // good practice
    }
}

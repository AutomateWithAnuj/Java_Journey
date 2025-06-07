package Java_Programs._10_UserInput;

import java.util.Scanner;

public class P038_Scanner_Input_If_Condtion {
    public static void main(String[] args) {
        //Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age);
    }
}

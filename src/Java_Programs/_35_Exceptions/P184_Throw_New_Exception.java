package Java_Programs._35_Exceptions;

import java.util.Scanner;

public class P184_Throw_New_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:  ");
        int age = sc.nextInt();
        try {
            ValidateAge(age);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    public static void ValidateAge(int age) throws Exception {
        if (age<18){
            throw new Exception("You cann't go else you will be out of house!");
        }
    }
}

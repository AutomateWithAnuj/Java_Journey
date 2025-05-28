package Java_Programs;

import java.util.Scanner;

public class P043_Switch_Cases_Debugging {
    public static void main(String[] args) {
        //Take a user input and tell them the day which they have told
        // 1 to 7 -> 1 means monday, 5 mean friday
        // number 8 or more than 8 is not allowed or must be invalid
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7: ");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day Number");
                break;

            //but if we will give the name here it will give us InputMismatchException
            //we can handle that into the Exception handling
        }
    }
}

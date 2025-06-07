package Java_Programs._14_If_elseif_else_blocks;

import java.util.Scanner;

public class P041_UserInput_Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%2!=0){
            System.out.printf("%d is odd",num);
        } else {
            System.out.printf("%d is even",num);
        }
    }
}

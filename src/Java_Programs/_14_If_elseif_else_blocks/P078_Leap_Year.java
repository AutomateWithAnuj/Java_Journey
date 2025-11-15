package Java_Programs._14_If_elseif_else_blocks;

import java.util.Scanner;

public class P078_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt(); //32 bit size //-2,147,483,648  to  2,147,483,647
        if(year%100==0&&(year/100)%4==0){
            System.out.println("Yes it is a leap year");
        }else if (year%100!=0&&year%4==0){
            System.out.println("Yes it is a leap year");
        }else {
            System.out.println("No it is not a leap year");
        }
    }
}

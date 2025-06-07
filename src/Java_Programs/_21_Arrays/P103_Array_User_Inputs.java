package Java_Programs._21_Arrays;

import java.util.Scanner;

public class P103_Array_User_Inputs {
    public static void main(String[] args) {
        //Using CLI
        int[] marks2 = new int[5];
        for (int i=0;i<marks2.length;i++){
            marks2[i]=Integer.parseInt(args[i]);
        }
        for (int i=0;i<marks2.length;i++){
            System.out.print(marks2[i]+" ");
        }
        //using Scanner Class
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        //System.out.println(marks[0]);
        for (int i=0;i<marks.length;i++){
            System.out.printf("Enter %d number: ",i);
            marks[i] = sc.nextInt();
        }
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}

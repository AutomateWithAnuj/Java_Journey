package Java_Programs._16_ForLoop;

import java.util.Scanner;

public class P115_Reverse_Right_Angle_Triangle {
    public static void main(String[] args) {
        //****
        //***
        //**
        //*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){ //print the n first then n-1, n-2 ... 
                //in this condition j print for all values till of n-i
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

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
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package Java_Programs._16_ForLoop;

import java.util.Scanner;

public class P077_RightTriangle_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        //*
        //**
        //***
        //****
        //*****
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i>=j){ //print when j is smaller or equal to i
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

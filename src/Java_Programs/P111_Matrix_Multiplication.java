package Java_Programs;

import java.util.Scanner;

public class P111_Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int size = sc.nextInt();

        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                System.out.print(i + "x" + j + "=" + (i*j)+"\t\t");
            }
            System.out.println();
        }
    }
}

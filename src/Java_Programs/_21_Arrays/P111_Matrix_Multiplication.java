package Java_Programs._21_Arrays;

import java.util.Scanner;

public class P111_Matrix_Size_Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ----------------------------------------
        // Input the size of the square matrix
        // ----------------------------------------
        System.out.print("Enter the size of matrix: ");
        int size = sc.nextInt(); // Example: 4

        // ----------------------------------------
        // Generate multiplication table (matrix)
        // ----------------------------------------
        for (int i = 0; i < size; i++) {           // Loop over rows
            for (int j = 0; j < size; j++) {       // Loop over columns
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println(); // Move to next row
        }

        sc.close();

        // ----------------------------------------
        // Example Input and Output for demo
        // ----------------------------------------
        // Input: 4
        // Output:
        // 0x0=0	0x1=0	0x2=0	0x3=0
        // 1x0=0	1x1=1	1x2=2	1x3=3
        // 2x0=0	2x1=2	2x2=4	2x3=6
        // 3x0=0	3x1=3	3x2=6	3x3=9
    }
}

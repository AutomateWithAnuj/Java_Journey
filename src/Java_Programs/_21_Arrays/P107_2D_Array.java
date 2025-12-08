import java.util.Scanner;

public class Array2DExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------------------------------------------
        // 1️⃣ Declaration of a 2D array
        // -------------------------------------------

        // Example A: Declaring only (size not required immediately)
        int[][] arr1;

        // Example B: Declaring with row and column size
        // NOTE: Size must be given when memory allocation happens.
        int[][] arr2 = new int[3][3];
        // Here:
        // 3 --> number of rows (mandatory)
        // 3 --> number of columns (mandatory)
        // Both rows and columns must be mentioned while creating memory.

        // -------------------------------------------
        // 2️⃣ Initializing a 2D array (Different ways)
        // -------------------------------------------

        // Way 1: Direct initialization with values (most common)
        int[][] arr3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Way 2: Declare first, fill later using loops or input
        int[][] matrix = new int[3][3]; 
        // Here "3 (rows)" and "3 (columns)" are mandatory.

        System.out.println("Enter 9 values to fill the 3x3 matrix:");

        // -------------------------------------------
        // 3️⃣ Taking user input in 2D array using loops
        // -------------------------------------------
        for (int i = 0; i < 3; i++) {         // Loop for rows
            for (int j = 0; j < 3; j++) {    // Loop for columns
                matrix[i][j] = sc.nextInt();
            }
        }

        // -------------------------------------------
        // 4️⃣ Displaying the 2D array
        // -------------------------------------------
        System.out.println("The entered 2D matrix is:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next row
        }

        sc.close();
    }
}

package Java_Programs._21_Arrays;

public class P107_2D_Array {
    public static void main(String[] args) {

        // A 2D array is like a table (Matrix format)
        // Example representation:
        /*
             1  2  3
             4  5  6
             7  8  9
        */

        // Total Rows (R) = 3
        // Total Columns (C) = 3

        // ----------------------- Method 1: Declare then Assign Values -----------------------
        // Creating a 2D array of size 3x3
        int[][] array_2d = new int[3][3];

        // Assigning values manually (index based: row, column)
        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;

        array_2d[1][0] = 4;
        array_2d[1][1] = 5;
        array_2d[1][2] = 6;

        array_2d[2][0] = 7;
        array_2d[2][1] = 8;
        array_2d[2][2] = 9;


        // ----------------------- Method 2: Direct Initialization -----------------------
        // Cleaner and readable format, used most of the time
        int[][] array_2d_old = {
                {1, 2, 3},  // Row 0
                {4, 5, 6},  // Row 1
                {7, 8, 9}   // Row 2
        };


        // ----------------------- Printing the 2D Array -----------------------
        System.out.println("2D Array Elements:");

        for (int i = 0; i < array_2d_old.length; i++) {           // Outer loop for rows
            for (int j = 0; j < array_2d_old[i].length; j++) {   // Inner loop for columns
                System.out.print(array_2d_old[i][j] + " ");
            }
            System.out.println(); // For new line after each row
        }
    }
}

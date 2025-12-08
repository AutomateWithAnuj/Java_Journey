package Java_Programs._21_Arrays;

public class P110_Iterate_2DArray {
    public static void main(String[] args) {

        // -------------------------------
        // 2D Array (Matrix) Example
        // -------------------------------
        // 3x3 matrix
        int[][] matrix = {
                {1, 2, 3},   // Row 0
                {4, 5, 6},   // Row 1
                {7, 8, 9}    // Row 2
        };

        // -------------------------------
        // Iterating through 2D array
        // -------------------------------
        // Outer loop → rows
        // Inner loop → columns
        for (int i = 0; i < matrix.length; i++) {           // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) {    // Loop through columns in row i
                System.out.print(matrix[i][j] + " ");       // Print each element
            }
            System.out.println(); // Move to next line after each row
        }

        // -------------------------------
        // Expected Output:
        // -------------------------------
        // 1 2 3
        // 4 5 6
        // 7 8 9
    }
}

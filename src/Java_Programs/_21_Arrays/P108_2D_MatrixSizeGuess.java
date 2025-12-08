package Java_Programs._21_Arrays;

public class P108_2D_MatrixSizeGuess {
    public static void main(String[] args) {

        // ⬇️ Matrix Example 1: 3 rows and 3 columns (3x3 matrix)
        int[][] matrix_3_3 = {
                {1, 2, 3},   // Row 0 → 3 elements
                {4, 5, 6},   // Row 1 → 3 elements
                {7, 8, 9}    // Row 2 → 3 elements
        };

        // ⬇️ Matrix Example 2: 2 rows and 2 columns (2x2 matrix)
        int[][] matrix_2_2 = {
                {1, 2},     // Row 0
                {3, 4}      // Row 1
        };

        // ⬇️ Matrix Example 3: 3 rows and 1 column (3x1 matrix)
        int[][] matrix_3_1 = {
                {1},        // Row 0
                {3},        // Row 1
                {5}         // Row 2
        };

        // -----------------------------------------------------------
        // 📌 IMPORTANT RULE:
        // In a 2D array → int[row][column]
        // ❗ Rows always come first, then columns.
        // -----------------------------------------------------------

        // Print number of rows and columns for each matrix
        System.out.println("matrix_3_3 → Rows: " + matrix_3_3.length + 
                           ", Columns: " + matrix_3_3[0].length);
        // Output: matrix_3_3 → Rows: 3, Columns: 3

        System.out.println("matrix_2_2 → Rows: " + matrix_2_2.length + 
                           ", Columns: " + matrix_2_2[0].length);
        // Output: matrix_2_2 → Rows: 2, Columns: 2

        System.out.println("matrix_3_1 → Rows: " + matrix_3_1.length + 
                           ", Columns: " + matrix_3_1[0].length);
        // Output: matrix_3_1 → Rows: 3, Columns: 1
    }
}

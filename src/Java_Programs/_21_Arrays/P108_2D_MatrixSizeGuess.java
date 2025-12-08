package Java_Programs._21_Arrays;

public class P108_2D_MatrixSizeGuess {
    public static void main(String[] args) {

        // ⬇️ Matrix Example 1: 3 rows and 3 columns (3x3 matrix)
        // Each inner { } represents one row.
        int[][] matrix_3_3 = {
                {1, 2, 3},   // Row 0 → 3 elements (3 columns)
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
                {1},        // Row 0 with 1 element
                {3},        // Row 1 with 1 element
                {5}         // Row 2 with 1 element
        };

        // -----------------------------------------------------------
        // 📌 IMPORTANT RULE:
        // In a 2D array format → int[row][column]
        // ❗ Rows always come first, then columns.
        // -----------------------------------------------------------

        // We can verify sizes using .length
        System.out.println("matrix_3_3 → Rows: " + matrix_3_3.length + 
                           ", Columns: " + matrix_3_3[0].length);

        System.out.println("matrix_2_2 → Rows: " + matrix_2_2.length + 
                           ", Columns: " + matrix_2_2[0].length);

        System.out.println("matrix_3_1 → Rows: " + matrix_3_1.length + 
                           ", Columns: " + matrix_3_1[0].length);
    }
}

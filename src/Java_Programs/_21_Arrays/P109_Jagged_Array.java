package Java_Programs._21_Arrays;

public class P109_Jagged_Array {
    public static void main(String[] args) {

        // -------------------------------
        // Jagged Array in Java
        // -------------------------------
        // A jagged array is a 2D array where rows can have a different number of columns.
        // Unlike regular 2D arrays, where every row has the same column size.
        // Here we create a jagged array with 3 rows:
        // Row 0 → 3 columns
        // Row 1 → 4 columns
        // Row 2 → 1 column

        int[][] jaggedArray = {
                {1, 2, 3},      // Row 0 → 3 elements
                {4, 5, 6, 7},   // Row 1 → 4 elements
                {9}             // Row 2 → 1 element
        };

        // -------------------------------
        // Accessing elements in a jagged array
        // -------------------------------
        System.out.println("Element at row 0, column 2: " + jaggedArray[0][2]);
        // Output: 3

        System.out.println("Element at row 1, column 3: " + jaggedArray[1][3]);
        // Output: 7

        System.out.println("Element at row 2, column 0: " + jaggedArray[2][0]);
        // Output: 9

        // -------------------------------
        // Printing the entire jagged array
        // -------------------------------
        System.out.println("\nJagged Array Elements:");
        for (int i = 0; i < jaggedArray.length; i++) {           // Loop over rows
            for (int j = 0; j < jaggedArray[i].length; j++) {   // Loop over columns in each row
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
        // Output:
        // 1 2 3
        // 4 5 6 7
        // 9
    }
}

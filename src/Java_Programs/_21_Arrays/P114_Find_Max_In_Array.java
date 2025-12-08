package Java_Programs._21_Arrays;

public class P114_Find_Max_In_Array {

    public static void main(String[] args) {

        // Example Matrix (3x3)
        //  1   2   3
        //  4   5   6
        //  7   8   9
        //
        // We will iterate through each element and find the maximum value
        // WITHOUT using sorting.

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Assuming first element as max initially
        int max = matrix[0][0];

        // Loop to find the maximum element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Maximum Value in Matrix is: " + max);

        /*
         -------- Example Output --------

         Maximum Value in Matrix is: 9

         --------------------------------
        */
    }
}

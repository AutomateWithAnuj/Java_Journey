package Java_Programs._21_Arrays;

public class P099_CreateArrays {
    public static void main(String[] args) {

        // A normal integer variable
        int a = 10;

        // Creating an integer array with predefined values
        // Each value is stored at an index (starting from 0)
        int[] marks = {51, 100, 91, 87, 90, 91, 92};

        // Boolean array storing true/false values
        boolean[] is_married_people = {true, false, true};

        // Printing the number of elements in the array
        System.out.println(marks.length); // 7
        /*
            Output: 7
            Reason: The array contains 7 values:
                    51, 100, 91, 87, 90, 91, 92
        */

        // Accessing elements using their index
        System.out.println(marks[0]); //51
        /*
            Output: 51
            Reason: Index 0 → first element of the array
        */

        System.out.println(marks[4]); //90
        /*
            Output: 90
            Reason: Index 4 → 5th element (since indexing starts from 0)
        */

        // Uncommenting any of the below will cause a runtime error
        // System.out.println(marks[10]); // ❌ ArrayIndexOutOfBoundsException (index does not exist)
        // System.out.println(marks[-1]); // ❌ Negative index is not allowed
    }
}

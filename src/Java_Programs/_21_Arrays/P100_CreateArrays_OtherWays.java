package Java_Programs._21_Arrays;

public class P100_CreateArrays_OtherWays {
    public static void main(String[] args) {

        // Creating an empty int array of size 5
        int[] marks2 = new int[5];  // All values will automatically be initialized to 0

        // Another valid way of declaring an array (same as above)
        int marks3[] = new int[5];

        // Creating a String array with size 3
        String[] names = new String[3];

        // Assigning values using index
        names[0] = "anuj";
        names[1] = "amit";
        names[2] = "lekhu";

        // Printing first element of marks2
        System.out.println(marks2[0]);
        /*
            Output: 0
            Reason: For numeric arrays, Java assigns a default value = 0 
            (not an address, because printing an array element prints its stored value)
        */

        // Printing each name using a loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            /*
                Output:
                anuj
                amit
                lekhu
                Reason: We stored these values using indexes.
            */
        }
    }
}

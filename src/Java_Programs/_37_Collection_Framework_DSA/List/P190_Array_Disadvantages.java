package Java_Programs._37_Collection_Framework_DSA.List;

/**
 * Demonstrates the disadvantages of using Arrays in Java
 */
public class P190_Array_Disadvantages {

    public static void main(String[] args) {

        // Creating an Integer array with fixed size of 10
        Integer[] arr = new Integer[10];

        // Storing an Integer value at index 0
        arr[0] = 12;

        // arr[1] = "Anuj";
        // ❌ Not allowed: Arrays are type-safe
        // Only Integer values can be stored in Integer[]

        /*
         * Disadvantages of Arrays:
         *
         * 1. Fixed Size:
         *    - Size must be defined at creation time
         *    - Cannot grow or shrink dynamically
         *
         * 2. Similar Data Type Only:
         *    - Cannot store different types of data in a single array
         *
         * 3. No Automatic Growth:
         *    - If more elements are needed, a new array must be created
         *
         * 4. Memory Wastage:
         *    - If array size is large and few elements are used,
         *      unused memory is wasted
         *    - Example: size = 100, used = 10 → 90 unused
         */
    }
}

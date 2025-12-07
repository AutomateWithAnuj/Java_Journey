package Java_Programs._20_Strings;

public class P095_StringBuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Anuj");
        // Creates a mutable StringBuilder object in Heap memory.
        // Initial value: "Anuj"

        System.out.println(stringBuilder.append("Rajput"));
        /* 
         Output: AnujRajput
         Reason: append() modifies the same object instead of creating a new one.
         There is no need to assign back because StringBuilder is mutable.
        */

        System.out.println(stringBuilder.append(123));
        /*
          Output: AnujRajput123
          Reason: append() supports multiple data types 
          (int, boolean, float, char, string, etc.), and appends them directly.
        */

        System.out.println(stringBuilder.reverse());
        /*
          Output: 321tupjaRjunA
          Reason: reverse() reverses the characters of the current content 
          in the same object (still one object in memory).
        */
    }
}

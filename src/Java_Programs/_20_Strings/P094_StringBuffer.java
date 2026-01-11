package Java_Programs._20_Strings;

public class P094_StringBuffer {
    public static void main(String[] args) {
        
        // Mutable object stored in Heap memory
        StringBuffer stringBuffer = new StringBuffer("Anuj");  
        // At this point -> stringBuffer = "Anuj"

        stringBuffer.append("Rajput");  
        // StringBuffer is mutable, so this modifies the same object.
        // No new object is created (unlike the String class).
        // Now stringBuffer = "AnujRajput"

        System.out.println(stringBuffer);  
        // Output: AnujRajput
        // Reason: append() added text to the same memory reference.

        System.out.println(stringBuffer.reverse()); 
        // Output: tupjaRjunA
        // Reason: reverse() modifies the same object by reversing characters.
        // The original "AnujRajput" becomes "tupjaRjunA".

        // After these operations, still only ONE object exists in memory.
        // ------------------ More StringBuffer Operations ------------------

        StringBuffer sb = new StringBuffer("Java");
        // sb = "Java"

        sb.append("Programming");
        // sb = "JavaProgramming"

        System.out.println(sb);
        // Output: JavaProgramming
        
        // delete(start, end) → removes characters from index 5 to 15 (end index exclusive)
        sb.delete(5, 16);
        // Remaining string = "Java" + "g"  → because "Programming" (except 'g') is removed
        // Result: "Javag"

        System.out.println(sb);
        // Output: Javag

        sb.replace(0, 4, "C++");
        // Replace characters from index 0 to 3 with "C++"
        // Old: "Jav ag"
        // New: "C++g"
        
        System.out.println(sb);
        // Output: C++g
    }
}

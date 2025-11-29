package Java_Programs._20_Strings;

public class P089_String_Immutable {
    public static void main(String[] args) {
        
        String s1 = "hello";  
        // "hello" is stored in the String Constant Pool (SCP).

        s1 = s1.concat("world"); 
        // The concat() method does NOT modify the original string.
        // Instead, it creates a NEW string: "helloworld".
        // After reassignment, the reference 's1' now points to this new string.
        
        System.out.println(s1); // Output: helloworld
        
        // Important:
        // Before concat: s1 → "hello"
        // After concat:  s1 → "helloworld"
        //
        // Both strings ("hello" and "helloworld") exist in memory.
        // The original "hello" remains unchanged because Strings are immutable.
    }
}

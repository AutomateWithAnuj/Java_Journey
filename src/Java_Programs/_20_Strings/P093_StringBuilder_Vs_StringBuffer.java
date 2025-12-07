package Java_Programs._20_Strings;

public class P093_StringBuilder_Vs_StringBuffer {
    public static void main(String[] args) {

        // String literal -> stored in String Constant Pool (SCP)
        String s0 = "Anuj";

        // new keyword -> stored in Heap memory (outside SCP), 
        // but "Anuj" literal inside still goes to SCP
        String s1 = new String("Anuj");

        // Stored only in Heap (Mutable)
        StringBuffer stringBuffer = new StringBuffer("Anuj");

        // Stored only in Heap (Mutable)
        StringBuilder stringBuilder = new StringBuilder("Anuj");

        // ----- OUTPUT -----
        System.out.println(s0);            // Output: Anuj
        // Reason: s0 holds the literal directly from SCP.

        System.out.println(s1);            // Output: Anuj
        // Reason: Even though created using new(), it prints the stored characters.

        System.out.println(stringBuffer);  // Output: Anuj
        // Reason: StringBuffer overrides toString() so it prints the text stored.

        System.out.println(stringBuilder); // Output: Anuj
        // Reason: StringBuilder also overrides toString() to print stored content.
    }
}

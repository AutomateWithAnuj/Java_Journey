package Java_Programs._20_Strings;

public class P091_String_Comparisons {
    public static void main(String[] args) {

        // Strings created using string literals are stored in the String Constant Pool (SCP)
        String s1 = "Hello";
        String s4 = "Hello"; // This will point to the same object as s1

        // Strings created using 'new' keyword are stored in Heap memory (not in SCP)
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // -------------------------------------------------
        // 1️⃣  Using == operator
        // == compares memory location (reference), NOT the content
        // -------------------------------------------------

        System.out.println(s1 == s3); // false -> different memory locations (SCP vs Heap)
        System.out.println(s1 == s2); // false -> different memory locations
        System.out.println(s2 == s3); // false -> both are in Heap but separate objects
        System.out.println(s1 == s4); // true  -> both refer to same object in SCP
        System.out.println(s3 == s5); // false -> different objects and values

        // -------------------------------------------------
        // 2️⃣  Using equals() method
        // equals() checks ONLY the content/value of the string
        // -------------------------------------------------

        System.out.println(s1.equals(s2)); // true  -> content is same ("Hello")
        System.out.println(s1.equals(s3)); // true  -> same content
        System.out.println(s3.equals(s5)); // false -> content differs ("Hello" vs "hello")

        // -------------------------------------------------
        // 3️⃣  equalsIgnoreCase()
        // Ignores case differences while comparing content
        // -------------------------------------------------

        System.out.println(s3.equalsIgnoreCase(s5)); // true -> case ignored ("Hello" == "hello")
    }
}

package Java_Programs._20_Strings;

public class P092_String_Functions {
    public static void main(String[] args) {

        String name = "Anuj";

        // 1. length() → returns number of characters
        System.out.println(name.length());        // Output: 4

        // 2. charAt(index) → returns character at given index
        System.out.println(name.charAt(3));       // Output: j
        // System.out.println(name.charAt(10));   // Throws: StringIndexOutOfBoundsException

        // 3. concat() → appends another string
        System.out.println(name.concat("Rajput")); // Output: AnujRajput

        // 4. contains() → checks whether a substring exists
        System.out.println(name.contains("om"));   // Output: false

        // 5. equals() → compares exact value (case-sensitive)
        System.out.println(name.equals("Anuj"));   // Output: true

        // 6. equalsIgnoreCase() → case-insensitive comparison
        System.out.println(name.equalsIgnoreCase("anuj")); // Output: true

        // -----------------------------
        // indexOf() and lastIndexOf()
        // -----------------------------

        String n = "anujrajputisgoodboy";

        // 7. indexOf() → first occurrence index
        System.out.println(n.indexOf('a'));        // Output: 0

        // 8. lastIndexOf() → last occurrence index
        System.out.println(n.lastIndexOf("a"));    // Output: 5

        // 9. replace(old, new) → replaces characters or substrings
        System.out.println(name.replace('n', 'N')); // Output: ANuj

        // 10. split() → splits string based on a delimiter, returns array
        String gmail = "anujrajput8959@gmail.com";
        String[] split = gmail.split("@");

        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i] + " ");      // Output: anujrajput8959 gmail.com
        }
        System.out.println();

        // 11. substring(start, end) → returns part of string (endIndex excluded)
        System.out.println(name.substring(1, 3));  // Output: nu

        // 12. startsWith() → checks if string starts with given value
        System.out.println(name.startsWith("A"));  // Output: true

        // 13. trim() → removes leading and trailing spaces
        String name2 = "   Anuj Rajput   ";
        System.out.println(name2.trim());          // Output: Anuj Rajput

        // 14. compareTo() → compares lexicographically (returns 0 if equal)
        System.out.println(name.compareTo("Anuj")); // Output: 0
    }
}

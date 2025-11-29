package Java_Programs._20_Strings;

public class P090_Strings_Functions {
    public static void main(String[] args) {
        
        String s1 = "ABC";
        
        // length(): returns the total number of characters in the string
        System.out.println(s1.length());   // Output: 3
        
        // toLowerCase(): converts the string to all lowercase letters
        System.out.println(s1.toLowerCase());  // Output: abc
        
        // toUpperCase(): converts the string to all uppercase letters
        System.out.println(s1.toUpperCase());  // Output: ABC
        
        // concat(): joins/append another string to the existing string 
        System.out.println(s1.concat("D"));    // Output: ABCD
    }
}

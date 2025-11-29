package Java_Programs._20_Strings;

public class P086_Strings_Immutable_Examples {
    public static void main(String[] args) {
        
        String name = "Anuj";  
        // Strings in Java are immutable, meaning once created, 
        // their value cannot be changed in memory.
        
        name.toUpperCase(); 
        // This method returns a NEW string "ANUJ",
        // but it does NOT change the original "name" variable.
        // Since we did not store the new returned string, it is lost (no reference).
        
        System.out.println(name);  
        // Output: Anuj → because the original value is untouched.
        
        // Explanation:
        // "Anuj" is stored in the String Pool.
        // toUpperCase() creates a new string "ANUJ" and also stores it (usually) in memory.
        // But the variable 'name' still points to the old string.
        // To actually modify the value, we must reassign the reference:
        
        name = name.toUpperCase(); // Now name points to "AN

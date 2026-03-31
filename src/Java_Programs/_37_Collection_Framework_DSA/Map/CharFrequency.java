import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        // Input string
        String name = "anuj rajput";

        // Create a Map to store character and its count
        // Character = key (a, n, u, j...)
        // Integer = value (count)
        Map<Character, Integer> map = new HashMap<>();

        // Convert string into character array and loop through each character
        for (char c : name.toCharArray()) {

            // Ignore spaces
            if (c != ' ') { 

                // Check if character already exists in map
                if (map.containsKey(c)) { //c does not exist as of now in start
                    
                    // If exists, get current count and increase by 1
                    map.put(c, map.get(c) + 1); //fetching its current value
                    
                } else {
                    
                    // If character appears first time, add it with count = 1
                    map.put(c, 1);
                }
            }
        }

        // Loop through map to print key and value
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            
            // entry.getKey() -> character
            // entry.getValue() -> count
            
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}

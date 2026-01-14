package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Demonstrates a real-world example of using Maps to store student details
 * and storing multiple student maps in a List.
 */
public class P212_Real_Example_Maps {
    public static void main(String[] args) {

        // Create a map for the first student with various details
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "Diwakar");        // Student name
        student1.put("phone", "9876543210");    // Student phone
        student1.put("address1", "Bangalore");  // Address line 1
        student1.put("address2", 123);          // Address line 2 (can be number)

        // Create a map for the second student
        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "Lukcy");          // Student name
        student2.put("phone", "96789876");      // Student phone
        student2.put("address1", "Delhi");      // Address line 1
        student2.put("address2", 345);          // Address line 2

        // Store all student maps in a List
        List<Map<String, Object>> studentsList = new ArrayList<>(); //A list that stores multiple maps, 
        // each map has String keys and Object values.
        studentsList.add(student1);
        studentsList.add(student2);

        // Print the list of student maps
        System.out.println("Students List: " + studentsList);
        // Example Output:
        // Students List: [{name=Diwakar, phone=9876543210, address1=Bangalore, address2=123}, 
        //                 {name=Lukcy, phone=96789876, address1=Delhi, address2=345}]
    }
}

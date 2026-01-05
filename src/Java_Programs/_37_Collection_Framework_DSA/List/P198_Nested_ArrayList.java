package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates Nested ArrayList (List inside another List)
 */
public class P198_Nested_ArrayList {

    public static void main(String[] args) {

        // First list of fruits
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");

        System.out.println(fruits1);
        // Output: [orange, apple, cherry]

        // Second list of fruits
        List<String> fruits2 = new ArrayList<>();
        fruits2.add("mango");
        fruits2.add("papaya");
        fruits2.add("grapes");

        System.out.println(fruits2);
        // Output: [mango, papaya, grapes]

        // List of vegetables (non-generic for demonstration)
        List vegetables = new ArrayList<>();
        vegetables.add("tomato");
        vegetables.add("potato");
        vegetables.add("onion");

        System.out.println(vegetables);
        // Output: [tomato, potato, onion]

        // Creating a nested list to store all lists together
        List allFruitsAndVegetables = new ArrayList();

        // Adding individual lists into one parent list
        allFruitsAndVegetables.add(fruits1);
        allFruitsAndVegetables.add(fruits2);
        allFruitsAndVegetables.add(vegetables);

        // Printing nested ArrayList
        System.out.println(allFruitsAndVegetables);
        // Output: [[orange, apple, cherry], [mango, papaya, grapes], [tomato, potato, onion]]
    }
}

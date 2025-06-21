package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.*;

public class P198_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits1);

        List<String> fruits2 = new ArrayList<>();
        fruits1.add("mango");
        fruits1.add("papaya");
        fruits1.add("grapes");
        System.out.println(fruits2);

        List Vegetables = new ArrayList<>();
        fruits1.add("tomato");
        fruits1.add("potato");
        fruits1.add("onion");
        System.out.println(Vegetables);

        //let us add all together in i arraylist
        List allFruite_Vegetables = new ArrayList();
        allFruite_Vegetables.add(fruits1);
        allFruite_Vegetables.add(fruits2);
        allFruite_Vegetables.add(Vegetables);

    }
}

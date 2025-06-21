package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.*;

public class P196_LinkedList {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); //Arrays store elements in continuous memory

        List myList2 = new LinkedList(); //Doubly Linked list
        myList2.add("anuj");
        myList2.add("rajput");
        myList2.add("amit");
        myList2.add("amit"); //we can also store the duplicates in the linked list
        myList2.add(null);
        myList2.add(true);
        myList2.add(123);
        System.out.println(myList2);

        System.out.println(myList2.isEmpty());
        System.out.println(myList2.size());
        System.out.println(myList2.contains("rajput"));
        System.out.println(myList2.indexOf("amit"));
    }
}

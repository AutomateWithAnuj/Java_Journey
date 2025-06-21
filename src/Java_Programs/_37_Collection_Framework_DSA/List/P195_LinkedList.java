package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.LinkedList;

public class P195_LinkedList {
    public static void main(String[] args) {
        LinkedList animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("LinkedList: "+animals);

        //get first and last element
        System.out.println("First Element: "+animals.getFirst());
        System.out.println("Last Element: "+animals.getLast());

        //remove first and last element
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal: "+animals);
        System.out.println("Size: "+animals.size());
    }
}

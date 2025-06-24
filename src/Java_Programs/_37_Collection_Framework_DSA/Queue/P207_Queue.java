package Java_Programs._37_Collection_Framework_DSA.Queue;

import java.util.PriorityQueue;

public class P207_Queue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Anuj");
        q.add("Rajput");
        //PriorityQueue -> it does the Natural Sorting automatically
        //Already added in natural order so it will not sort them in natural order
        System.out.println(q);
        System.out.println(q.peek());//it is seeing the first Element
        System.out.println(q.poll());//it will remove the first element
        System.out.println(q);
    }
}

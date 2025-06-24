package Java_Programs._37_Collection_Framework_DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class P209_Array_Deque {
    public static void main(String[] args) {
        Deque<Integer> adq = new ArrayDeque<>();
        //it also don't have the FIFO it also does the natural shorting
        adq.push(15);
        adq.push(10);
        System.out.println(adq);
    }
}

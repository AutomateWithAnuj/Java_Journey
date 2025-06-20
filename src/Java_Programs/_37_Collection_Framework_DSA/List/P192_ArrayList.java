package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class P192_ArrayList {
    public static void main(String[] args) {
        List l = new ArrayList(); //dynamic dispatch
        l.add("hello");
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add(23.45);
        l.add(null);

        System.out.println(l.size());
        ArrayList l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}

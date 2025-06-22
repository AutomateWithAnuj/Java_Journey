package Java_Programs._37_Collection_Framework_DSA.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class P203_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("anuj");
        hs.add("anuj");//duplicates are not allowed
        System.out.println(hs);
    }
}

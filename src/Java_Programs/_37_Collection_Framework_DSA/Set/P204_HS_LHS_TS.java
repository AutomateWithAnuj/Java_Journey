package Java_Programs._37_Collection_Framework_DSA.Set;

import java.util.*;

public class P204_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>(); //we didn't make it Generic we only want to store string
        //Hashing mechanism to store the element
        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon"); //no duplicates
        hs.add(null);
        hs.add(null); //2 null not allowed
        System.out.println(hs); //no order

        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set lhs = new LinkedHashSet();
        //LinkedList mechanism to store the elements
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon"); //no duplicates
        lhs.add(null);
        lhs.add(null); //2 null not allowed
        System.out.println(lhs); //order will be maintained,
        System.out.println(lhs.size());

        Set ts = new TreeSet();
        //Black and Red Tree mechanism to store the element
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon"); //no duplicates
//        ts.add(null); //we cannot add null because we cannot short if we add null
//        ts.add(null);
        System.out.println(ts); //Natural Shorting(short with first character) is done
        //Naturing shorting is done based on the ascii characters
        System.out.println(ts.size());

        //ts.add(123);//ClassCastException because it cannot be shorted with 123
        System.out.println(ts);
    }
}

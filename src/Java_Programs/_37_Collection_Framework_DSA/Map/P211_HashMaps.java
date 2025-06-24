package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class P211_HashMaps {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2); //duplicate key not allowed but only 1 will come
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",34); //duplicate value allowed
        map.put("id4",null); //null value is allowed
        map.put("id5",null);
        map.put(null,2); //null key allowed
        map.put(null,3); //duplicate key not allowed but only 1 will come
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id"));
        System.out.println(map.containsKey(99));

        //to get all the keys
        System.out.println(map.keySet());

        //to get all the values
        System.out.println(map.values());
    }
}

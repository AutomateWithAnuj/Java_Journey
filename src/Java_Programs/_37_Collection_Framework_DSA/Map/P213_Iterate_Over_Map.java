package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.*;

public class P213_Iterate_Over_Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("id1",1);
        map.put("id2",2);
        map.put("id3",3);
        map.put("id4",null);
        map.put("id5",null);
        map.put("id6",100);
        //we have to use the for advance loop and this is little complex so we have to learn this
        for (Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey()+ " -> "+item.getValue());
        }
    }
}

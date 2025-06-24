package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class P210_Maps {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        //keys will be in the different order in which user has entered
        m1.put("name","Anuj");
        m1.put("age","24");
        m1.put("rollNo","1");
        m1.put("PhoneNo","9171167945");
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        //keys will be in the same order in which user has entered
        m2.put("name","Anuj");
        m2.put("age","24");
        m2.put("rollNo","1");
        m2.put("PhoneNo","9171167945");
        System.out.println(m2);

        Map m3 = new TreeMap();
        //pairs will be shorted based on keys
        m3.put("Name","Anuj");
        m3.put("Age","24");
        m3.put("RollNo","1");
        m3.put("PhoneNo","9171167945");
        System.out.println(m3);
    }
}

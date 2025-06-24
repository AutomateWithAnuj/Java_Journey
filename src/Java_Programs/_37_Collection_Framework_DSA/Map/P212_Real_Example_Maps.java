package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P212_Real_Example_Maps {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        student1.put("name", "Diwakar");
        student1.put("phone", "9876543210");
        student1.put("address1", "Bangalore");
        student1.put("address2", 123);

        Map<String, Object> student2 = new HashMap();
        student2.put("name", "Lukcy");
        student2.put("phone", "96789876");
        student2.put("address1", "Delhi");
        student2.put("address2", 345);

        List sl = new ArrayList();
        sl.add(student1);
        sl.add(student2);
        System.out.println(sl);
    }

}

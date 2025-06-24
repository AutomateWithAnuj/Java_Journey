package Java_Programs._37_Collection_Framework_DSA.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class P214_Hashtable {
    public static void main(String[] args) {
        //Map - K,V null values allows but not for Hashtable
        //Hashtable - synchronized, slow and legacy class - thread safe
        //T1, T2 - they will use one by one
        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1,"one");
        ht1.put(2,"one");
        ht1.put(3,"three");
        ht1.put(4,"four");
        ht1.put(4,"five");

        //ht1.put(5,null); //NullPointerException
        System.out.println(ht1);

        //so in hashmap null values and null keys both are allowed but here hashtable it is not allowed
        //hashmap is not thread safe or we can say it is not synchronised

        //we can also iterate the hashtable by the enumeration for keys or values any one at a time
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}

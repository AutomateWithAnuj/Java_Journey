package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.LinkedList;
import java.util.List;

public class P194_LinkedList {
    public static void main(String[] args) {
        //List list = new LinkedList(10);//their is no concept of initial capacity in this
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c"); //it's location can be anywhere in memory for what we store
    }
}

package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class P193_ArrayList {
    public static void main(String[] args) {
        List<Integer> ol = new ArrayList(); //here it is restricted for only integers
        List ol2 = new ArrayList(10); //you can give the initial capacity if you want
        List list = new ArrayList(); //they are not restricted by any generics
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add(4);
        list.add(true);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));
        System.out.println(list);

        //print the list
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        //we can use many other functions present in this
    }
}

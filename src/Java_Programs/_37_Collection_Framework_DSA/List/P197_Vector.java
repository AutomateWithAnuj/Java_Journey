package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class P197_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector<Integer> v2 = new Vector(10);//here we can give the initial capacity
        //we can add elements in this like the ArrayList & LinkedList
        v.add("Anuj");
        v.add("Rajput");
        v.add("Amit");
        System.out.println(v);
        System.out.println(v.contains("Amit"));
        System.out.println(v);

        System.out.println("----- For Loop -----");
        for (int i=0;i<v.size();i++){
            System.out.print(v.get(i)+" ");
        }
        System.out.println("----- For Each Loop -----");
        for (Object o:v){ //it can contain any kind of datatypes so we have to consider it as object
            System.out.print(o+" ");
        }
        System.out.println("----- Iterator -----");
        Iterator iterator = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---- Enumeration -----");
        Enumeration<Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("---- ListIterator -----");
        ListIterator listIterator = v.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("---- Backward ListIterator -----");
        ListIterator listIterator2 = v.listIterator();
        while (listIterator2.hasPrevious()){
            System.out.println(listIterator2.previous());
        }
    }
}

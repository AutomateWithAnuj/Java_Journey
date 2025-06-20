package Java_Programs._37_Collection_Framework_DSA.List;

import java.util.List;

public class P191_List_I {
    public static void main(String[] args) {
        //List fruits = new List(); //not possible because it is an interface
        List fruits = List.of("orange","apple","banana","mango","watermelon");
        //we are using .of() by using the class name because it is a static function in List interface
        //interface can have static functions after JDK 13
        System.out.println(fruits);

        //but the static functions cannot be changed because you have created with of() function
        //now let us suppose we want to add chiku
        fruits.add("chiku");
        System.out.println(fruits); //UnsupportedOperationException
        //this happened because these are static functions and they cannot be changed
        //also this add function in list is incomplete which is abstract method
        fruits.remove("banana");
        System.out.println(fruits); //UnsupportedOperationException
        //this happened because these are static functions and they cannot be changed
        //also this add function in list is incomplete which is abstract method

        //so we have been not able to use those methods due to the List Interfaces we have used
        //inspite of it we have to use the Abstract classes for that which are
        //ArrayList, LinkedList, Stack, Vector
    }
}

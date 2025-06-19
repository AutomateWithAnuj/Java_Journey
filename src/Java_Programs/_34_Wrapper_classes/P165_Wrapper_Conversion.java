package Java_Programs._34_Wrapper_classes;

public class P165_Wrapper_Conversion {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 10; //This is called as Boxing
        //By using boxing JVM automatically will store the value primitive to wrapper
        System.out.println(b.intValue()); //Behaviour
        System.out.println(Integer.MIN_VALUE);
        Integer a2 = 42;
        int v = a2; //This is called as unBoxing
        //Unboxing means wrapper is removed and attributes and behaviours are lost
        System.out.println(v);
        //java loves to put everything in the heap area
    }
}

package Java_Programs;

public class P089_String_Immutable {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1.concat("world"); // concat will add the value
        System.out.println(s1);
        //so String constant pool will be having the 2 values Hello & Hello World
    }
}
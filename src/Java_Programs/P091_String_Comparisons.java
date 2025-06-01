package Java_Programs;

public class P091_String_Comparisons {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == -> Comparison -> String -> this check the location ref.
        System.out.println(s1==s3);//false
        System.out.println(s1==s2);//false
        System.out.println(s2==s3);//false
        System.out.println(s1==s4);//true
        System.out.println(s3==s5);//false

        // equals -> this check the value/content
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s5));//false
        System.out.println(s3.equalsIgnoreCase(s5));//true
    }
}

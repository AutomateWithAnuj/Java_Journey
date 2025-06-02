package Java_Programs;

public class P095_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Anuj");
        //Similar to the String buffer we can use string builder
        System.out.println(stringBuilder.append("Rajput"));
        // here append also allow us to use different datatypes
        System.out.println(stringBuilder.append(123));
        System.out.println(stringBuilder.reverse());
    }
}

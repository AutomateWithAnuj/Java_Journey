package Java_Programs;

public class P093_StringBuilder_Vs_StringBuffer {
    public static void main(String[] args) {
        //String we create like this 90% of the time
        String s0 = "Anuj"; // stored in String Constant Pool
        String s1 = new String("Anuj"); //new keyword means stored in object area

        StringBuffer stringBuffer = new StringBuffer("Anuj"); //new keyword means stored in object area
        StringBuilder stringBuilder = new StringBuilder("Anuj"); //new keyword means stored in object area

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}

package Java_Programs._20_Strings;

public class P094_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Anuj"); //First Anuj will be created
        stringBuffer.append("Rajput"); //Then Rajput will be appended
        //so as StringBuffer is mutable it means no assignment is required
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse()); //string will become tupjaRjunA
        //also here after performing these 3 operations there is only 1 string
        //because of that only it's better because when we used string class 3 were created

        StringBuffer sb = new StringBuffer("Java");
        sb.append("Programming");
        System.out.println(sb);
        sb.delete(5,16);
        System.out.println(sb);
        sb.replace(0,4,"C++");
    }
}

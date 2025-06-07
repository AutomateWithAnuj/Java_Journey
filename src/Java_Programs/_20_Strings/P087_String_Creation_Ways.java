package Java_Programs._20_Strings;

public class P087_String_Creation_Ways {
    public static void main(String[] args) {
        //String 2 ways
        String s1 = "Anuj"; //SCP - String constant pool
        //to check this click on String with ctrl to know who has created
        //because this will open the final class of String
        //String s1 = "Anuj"; is same as char data[] = {'A', 'n', 'u','j'};
        String s2 = new String("Anuj"); //OA - Object Area

    }
}

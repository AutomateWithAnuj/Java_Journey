package Java_Programs._20_Strings;

public class P098_Split_Function {
    public static void main(String[] args) {
        String str = "anuj";
        String[] parts = str.split("");
        for (String part: parts){
            System.out.println(part);
        }
    }
}
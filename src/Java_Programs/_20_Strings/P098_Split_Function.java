package Java_Programs._20_Strings;

public class P098_Split_Function {
    public static void main(String[] args) {

        // A simple string
        String str = "anuj";

        // split("") means split on every character
        // So the string will break into an array of single characters:
        // ["a", "n", "u", "j"]
        String[] parts = str.split("");

        // Using enhanced for loop to print each character separately
        for (String part : parts){
            System.out.println(part);
            /*
                Output:
                a
                n
                u
                j
            */
        }
    }
}

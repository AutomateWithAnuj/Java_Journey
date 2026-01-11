package Java_Programs._11_Operators;

public class P030_Nested_Ternary_Usage_Max_Amoung_3 {
    public static void main(String[] args) {
        //result = condition1 ? expression1 : (condition2 ? expression2 : expression3)
        int number = 5;
        String result = (number >= 10) ? "A" : (number >= 5 ? "B" : "C");
        System.out.println(result);

        //Max between 3 numbers

        //Always Ask for Inputs from who is asking write this program.

        int a = 27; int b = 35; int c = 37;
        int Max = a>b ? (a>c ? a:c):(b>c?b:c);
        System.out.println(Max);
    }
}

package Java_Programs;

public class P036_Inc_Dec_Op_Guess_Output {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        // A -> a++ -> ExpA -> 10, a = 11
        // B -> a -> 11
        // A+B -> ExpA + ExpB -> 21

        a = 10;
        System.out.println(a++ + ++a);//10+12 //22

        a = 10;
        System.out.println(++a + ++a); //23
        System.out.println(a); //12

        a = 10;
        System.out.println(++a + a++ + a++);//11 + 11 + 12 = 34
        System.out.println(a); //13

    }
}

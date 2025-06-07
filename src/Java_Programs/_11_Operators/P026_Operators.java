package Java_Programs._11_Operators;

public class P026_Operators {
    public static void main(String[] args) {
        //BODMAS
        //B – Brackets
        //O – Orders (i.e., powers and square roots, etc.)
        //D – Division
        //M – Multiplication
        //A – Addition
        //S – Subtraction
        System.out.println((9*3/9+1)*3); //(27/9+1)*3 //(3+1)*3 //12

        //Assignment operator - Assign the value from right to left
            int a = 20;
            int b = 3;
            float c = 3.0f;
            boolean bo = true;

        //compound Assignment operator
            //+=
                a+=10;
                System.out.println(a);
            //-=
                a-=10;
                System.out.println(a);
            //*=
                a*=10;
                System.out.println(a);
            //*=
                a/=10;
                System.out.println(a);

        //Arithmetic Operators
            // + Addition
                System.out.println(a+b);
            // - Substraction
                System.out.println(a-b);
            // * Multiplication
                System.out.println(a*b);
            // / Division
                System.out.println(a/b);
                System.out.println(a/c);
            // % Modulus - Remainder
                System.out.println(a%b);
                System.out.println(a%c);

        //Unary Operators
            a = -110;
            System.out.println(a);
            a = +10;
            System.out.println(a);

        //increment/Decrement Operator
            b = ++b;
            System.out.println(b);

        //Relational Operators - all will return the boolean value
            //< Less Than or > Greater than
                System.out.println(a>b);
            // <= or >=
                System.out.println(a<=b);
            // == Checking is Equal
                System.out.println(a==b);
            // != Not Equal
                System.out.println(a!=b);

        //Logical Operators
            // ! Reverse operator
                System.out.println(!bo);
                System.out.println(!!bo);
            // || OR Gate
                System.out.println(true||false);
            // && AND Gate
                System.out.println(true&&false);

        //Concatenation
            // + Concatenation Operator
                System.out.println("Anuj"+"Rajput"); // for strings its Concatenation
                System.out.println("Anuj"+"Rajput"+a+b);
                System.out.println("Anuj"+"Rajput"+(a+b));
                System.out.println(a+b); // for math its Arithmetic
                System.out.println(a+b+"Anuj"+"Rajput");

        //Misc Operators - from Digital Electronics
            // ~ Bitwise Not - ~n = -n - 1
                System.out.println(~a);
            // >> Right Shift - 1010 << 1 = 10100
                System.out.println(a<<1);
            // << Left Shift - 1010 >> 1 = 0101
                System.out.println(a>>1);
            // ^ XOR
                System.out.println(1010 ^ 0011);

        //Ternary Operator // ? :
            int age = 10;
            String CanIVote = age >= 18 ? "Yes":"No";
            System.out.println(CanIVote);

        //New Operator - OOPs related
        String s = new String("Anuj"); // new is keyword and operator both

        //instanceof operator - OOPs related
        System.out.println(s instanceof String);


    }
}

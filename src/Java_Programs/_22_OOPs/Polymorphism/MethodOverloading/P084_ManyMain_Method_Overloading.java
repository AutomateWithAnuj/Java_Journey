package Java_Programs._22_OOPs.Polymorphism.MethodOverloading;

public class P084_ManyMain_Method_Overloading {
    //yes we can have many main methods that can be possible by method overloading
    public static void main(String[] args) {
        main(10);//it will go for int args one
        main(true);//it will go for int args one
    }
    public static void main(String args) {//yes it is possible with different arguments

    }
    public static void main(int args) {//yes it is possible with different arguments

    }
    public static void main(boolean args) {//yes it is possible with different arguments

    }
}

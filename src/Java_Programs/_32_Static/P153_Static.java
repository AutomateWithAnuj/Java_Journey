package Java_Programs._32_Static;

public class P153_Static {
    public static void main(String[] args) {
        A ref = new A(10);
        ref.displayValue();
        System.out.println(ref.b);
        System.out.println(A.b); //static can also be called by using class name
        A.b = 45;

        A ref2 = new A(20);
        ref2.displayValue();
        System.out.println(ref.b);
        System.out.println(A.b); //static can also be called by using class name
    }
}
class A{
    int a= 10; //non static variable
    static int b = 20; //static variable

    A(int a){
        this.a = a;
    }
    void displayValue(){
        System.out.println(this.a);
    }
}

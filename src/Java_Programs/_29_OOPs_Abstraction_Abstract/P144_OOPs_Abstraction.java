package Java_Programs._29_OOPs_Abstraction_Abstract;

public class P144_OOPs_Abstraction {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k();
        //Father f1 = new Father();
        Father f2 = new Child();
    }
}
abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Given 25k");
    }
}
class Child extends Father{
    @Override
    void loan50k(){
        System.out.println("Child will pay the loan!");
    }
}
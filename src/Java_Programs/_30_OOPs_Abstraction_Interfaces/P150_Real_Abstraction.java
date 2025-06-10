package Java_Programs._30_OOPs_Abstraction_Interfaces;

public class P150_Real_Abstraction {
    public static void main(String[] args) {

    }
}
interface IncompleteClass{
    int a = 10;
    void display();
}
class ConcreteClass implements IncompleteClass{
    @Override
    public void display(){
        System.out.println("Hi");
    }
}

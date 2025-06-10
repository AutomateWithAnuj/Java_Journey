package Java_Programs._30_OOPs_Abstraction_Interfaces;

public class P149_Interface_MultipleInheritance_Interface {

}
interface Mother{
    void money();
}
interface Father{
    void money();
}
class Child implements Mother,Father{
    @Override
    public void money(){
        System.out.println("Everything is yours");
    }
}

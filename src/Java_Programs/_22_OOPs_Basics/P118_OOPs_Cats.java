package Java_Programs._22_OOPs_Basics;

public class P118_OOPs_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2; //without object reference
        //till here we are having 2 references
        new Cat(); //without reference object
        //till here we have 2 objects

        c1.running();
        //c2.running(); //it will throw error because no object is associated with this reference

        //Is this possible
        new Cat().running(); //Yes
        System.out.println(new Cat().name);
        //till now we have 4 objects
    }
}
class Cat{
    String name;
    void running(){
        System.out.println("Running");
    }
}

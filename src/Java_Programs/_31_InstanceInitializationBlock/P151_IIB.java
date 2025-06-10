package Java_Programs._31_InstanceInitializationBlock;

public class P151_IIB {
    //IIB - Instance Initialization Block
    //Will be executed when object is created
    public static void main(String[] args) {
        A a = new A(); //so IIB will be called by itself
    }
}
class A{
    A(){
        System.out.println("I am default constructor");
    }
    {
        System.out.println("Hi, I am IIB"); //this is IIB
    }
    {
        System.out.println("Hi, I am IIB 2"); //Any number of IIB we can have
    }
}

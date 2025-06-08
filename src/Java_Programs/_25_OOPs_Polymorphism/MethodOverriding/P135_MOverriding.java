package Java_Programs._25_OOPs_Polymorphism.MethodOverriding;

public class P135_MOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }
}
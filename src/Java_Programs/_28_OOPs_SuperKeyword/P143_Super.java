package Java_Programs._28_OOPs_SuperKeyword;

public class P143_Super {

}
class Animal{
    protected String color = "White";
    void sound(){
        System.out.println("Animal Sound!");
    }
}
class Dog extends Animal{
    private String color = "Black";
    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}
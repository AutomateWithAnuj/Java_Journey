package Java_Programs._23_OOPs_Constructors;

public class P122_OOPs_DefaultConstructor {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name); //it will give us null if no constructor
        System.out.println(c1.year); //it will give us 0 if no constructor
        System.out.println(c1.model); //it will give us null if no constructor
        //so let us initialized them into the constructors and their value will change
        //Every object will have the same default constructor no matter what you create
    }
}
class Car{
    String name;
    int year;
    String model;
    Car(){
        name = "Anuj";
        year = 2024;
        model = "xyz";
    }
}

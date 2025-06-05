package Java_Programs;

public class P123_OOPs_ParamConstructor {
    public static void main(String[] args) {
        Car2 c2 = new Car2("Anuj",2025,"i20");
        System.out.println(c2.name);//it will give us null if no constructor
        System.out.println(c2.year); //it will give us 0 if no constructor
        System.out.println(c2.model); //it will give us null if no constructor

    }
}

class Car2{
    String name;
    int year;
    String model;
    Car2(String name,int year ,String model){
        this.name = name;
        this.year = year;
        this.model = model;
    }
}

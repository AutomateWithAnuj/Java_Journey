package Java_Programs._23_OOPs_Constructors;

public class P124_OOPs_ConstructorOverLoading {
    public static void main(String[] args) {
        Car3 c = new Car3();
        Car3 c2 = new Car3("Anshul",2025,"i20"); //you can also provide details here
        System.out.println(c.name);
        System.out.println(c.year);
        System.out.println(c.model);
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);
        Car3 c3 = new Car3("Amit",2025); //you can also provide details here
        System.out.println(c3.name);
        System.out.println(c3.year);
        System.out.println(c3.model);

        c.running();
        c2.running();
        c3.running();
    }
}

class Car3{
    String name;
    int year;
    String model;
    Car3(String name,int year ,String model){
        this.name = name; // here this is c3 which is the reference of the object it has
        this.year = year; // here this is c3 which is the reference of the object it has
        this.model = model; // here this is c3 which is the reference of the object it has
    }
    Car3(String name,int year){
        this.name = name; // here this is c3 which is the reference of the object it has
        this.year = year; // here this is c3 which is the reference of the object it has
    }
    Car3(){
        name = "Anuj";
        year = 2024;
        model = "xyz";
    }

    void running(){
        System.out.println(this.name+" is Running");
    }

}


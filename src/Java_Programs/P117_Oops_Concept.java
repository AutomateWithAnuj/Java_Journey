package Java_Programs;

public class P117_Oops_Concept {
    public static void main(String[] args) {
        Person amit;
        //so we have to use the new keyword to create a function
        //program start and end at main method because JVM works like that
        Person p2 = new Person();
        p2.name = "Anuj";
        System.out.println(p2.name);

        Person p3 = new Person();
        p3.name = "Rajput";
        System.out.println(p3.name);

        new Person();
        //so though attributes are same but the values will be different for different objects
    }
}
class Person{
    //Attribute / Properties / Data Members / Instance Variables
    String name;
    String phone;
    String color_eyes;
    int legs;
    int hands;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    //Behaviours / Function / Method
    void sleep(){
        System.out.println("I am sleeping");
    }
    String greet(String name){
        return "Hello" + name;
    }
    void talk(){

    }
    int tax_given(int salary, int tax){
        return salary-tax;
    }
}

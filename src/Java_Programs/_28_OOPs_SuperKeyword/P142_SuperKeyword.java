package Java_Programs._28_OOPs_SuperKeyword;

public class P142_SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}
class Vehicle{
    public int maxSpeed = 180;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Vehicle(){
        System.out.println("Default Constructor");
    }
    Vehicle(int a){
        System.out.println("Parameterized Constructor");
    }
    //Method Overloading Functions
    void message(){
        System.out.println("Method - No Return Type, No Arguments");
    }
    void message(int a){
        System.out.println("Method with Arguments");
    }
    //Normal Functions
    void display(){
        System.out.println("Vehicle Parent Method");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 281;
    Car(){
        super(); //to access the parents default constructors
    }
    Car(int a){
        super(a); //to access the parents parameterized constructors
    }
    //Method Overriding
    @Override
    void display(){
        System.out.println(this.maxSpeed); //this class max speed

        //Calling Parents Methods and Attributes
        System.out.println(super.maxSpeed); //parents max speed
        super.message();
        super.message(10);

        //Now calling parents constructors


        System.out.println("Vehicle Overridden Child Method");
    }
}
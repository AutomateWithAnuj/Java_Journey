package Java_Programs._29_OOPs_Abstraction_Abstract;

public class P145_AB_Cars {
    public static void main(String[] args) {
        i10 car = new i10();
//        car.drive();
        car.startEngine();
    }
}
abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}
class i10 extends Engine{ //Complete class no abstract methods

    @Override
    void startEngine() {
        System.out.println("Starting the Car!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the Car!");
    }
}

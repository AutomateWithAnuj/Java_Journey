package Java_Programs._30_OOPs_Abstraction_Interfaces;

import java.util.Calendar;

public class P148_Interface {
    public static void main(String[] args) {
        car c = new car();
        c.Drive(); //so by having this we know that everything is hidden then also we can apply all functionality
        //this is called abstraction nothing you can see but you can have the functionality
    }
}
interface Brakes{
    void applyBreak();
}
interface Engine{
    void startEngine();
    void stopEngine();
    void applyBreaks();
    default void test(){
        System.out.println("concrete complete");
    }
}
class car implements Brakes,Engine{

    @Override
    public void applyBreak() {

    }

    @Override
    public void startEngine() {
        System.out.println("Apply Brakes");
    }

    @Override
    public void stopEngine() {
        System.out.println("Apply Brakes");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Apply Brakes");
    }

    void Drive(){
        startEngine();
        applyBreak();
        startEngine();
    }
}

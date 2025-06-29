package Java_Programs._38_Threading.Synchronization.TypesOfSync;

import java.util.ArrayList;

public class Sync {
}
class sync01{
    void m1(){ //synchronization can be done at the method level
        synchronized (this.getClass()){
            System.out.println("Default object of class will be locked!!");
        }
    }
    static void m2(){
        synchronized (Sync.class){ //so we can add class variable also
            System.out.println("Default Object class will be locked");
        }
    }
    void m3(){
        synchronized (this){ //so we can also have this keyword also
            System.out.println("Current Object of the class will be locked");
        }
    }
    void m4(){
        ArrayList a = new ArrayList();
        synchronized (a){ //we can add arraylist also to the synchronized
            //here all the operations will be synchronized
            // 2 threads cannot be added to this arraylist simultaneously
            //they need to be added one by one
            System.out.println("Third party Object of Class Will be locked!!");
        }
    }
}

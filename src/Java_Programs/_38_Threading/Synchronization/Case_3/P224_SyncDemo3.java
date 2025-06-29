package Java_Programs._38_Threading.Synchronization.Case_3;

import java.util.concurrent.SynchronousQueue;

public class P224_SyncDemo3 {
    public static void main(String[] args) {
        Sync s1 = new Sync();
        A ta = new A(s1,"A");
        ta.start();
        B tb = new B(s1,"B");
        tb.start();
        //now they will run 1 by 1 first A thread then B thread
        //also it run the threads from top to bottom in the program
        //here they will not fight for the resources as they have been assigned(Synchronized) one after other
        //we can also call this locking the object by using synchronized keyword
    }
}
class Sync{
    synchronized void m1() throws InterruptedException {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5;i++){
            System.out.println(th.getName()+" - m1 - "+i);
            try{
                Thread.sleep(1000);
            } catch (Exception ex){

            }
        }
    }
    synchronized void m2() throws InterruptedException {
        Thread th = Thread.currentThread();
        for (int i = 101; i <= 105;i++){
            System.out.println(th.getName()+" - m2 - "+i);
            try{
                Thread.sleep(1000);
            } catch (Exception ex){

            }
        }
    }
}
class A extends Thread {
    Sync s;
    public A(Sync s,String tname){
        super(tname);
        this.s = s;
    }
    public void run(){
        try {
            s.m1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class B extends Thread {
    Sync s;
    public B(Sync s,String tname){
        super(tname);
        this.s = s;
    }
    public void run(){
        try {
            s.m2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
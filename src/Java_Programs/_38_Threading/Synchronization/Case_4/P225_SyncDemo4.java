package Java_Programs._38_Threading.Synchronization.Case_4;

import java.util.concurrent.SynchronousQueue;

public class P225_SyncDemo4 {
    public static void main(String[] args) {
        Sync s2 = new Sync();
        A ta = new A(s2,"A");
        ta.start();
        B tb = new B(s2,"B");
        tb.start();
        //here will be some inconsistencies because the lock is only on 1 method not other and if we create objects for m2 we will get more inconsistencies,
        //but they will run concurrently
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
    void m2() throws InterruptedException {
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
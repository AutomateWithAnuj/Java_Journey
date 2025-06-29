package Java_Programs._38_Threading.Synchronization.Case_1;

public class P222_SyncDemo1 {
    public static void main(String[] args) {
        Sync s1 = new Sync();
        Sync s2 = new Sync();
        A ta = new A(s1,"A");
        ta.start();
        B tb = new B(s2,"B");
        tb.start();
        //their cannot be any inconsistency
        //Because both methods are called by different objects
        //so no problem in this case because a problem occurs when we use the same object
    }
}
class Sync{
    void m1() throws InterruptedException {
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
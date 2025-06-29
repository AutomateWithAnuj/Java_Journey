package Java_Programs._38_Threading.Synchronization.Case_6;

public class P227_SyncDemo6 {
    public static void main(String[] args) {
        Sync s1 = new Sync();
        A ta = new A(s1,"A");
        ta.start();
        B tb = new B(s1,"B");
        tb.start();
        //no here will not be the inconsistencies
        //thread also will run 1 by 1
    }
}
class Sync{
    static synchronized void m1() throws InterruptedException {
        //here synchronization will be done at the instance level
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5;i++){
            System.out.println(th.getName()+" - m1 - "+i);
            try{
                Thread.sleep(1000);
            } catch (Exception ex){

            }
        }
    }
    static synchronized void m2() throws InterruptedException {
        //it means synchronization will be at the class level
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
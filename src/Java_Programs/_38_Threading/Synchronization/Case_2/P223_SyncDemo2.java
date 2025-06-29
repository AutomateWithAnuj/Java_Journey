package Java_Programs._38_Threading.Synchronization.Case_2;

public class P223_SyncDemo2 {
    public static void main(String[] args) {
        Sync s1 = new Sync();
        A ta = new A(s1,"A");
        ta.start();
        B tb = new B(s1,"B");
        tb.start();
        //here can be some inconsistency because they are working on same object
        //their can be a change where B thread can interface with A
        //so to resolve this issue we have the Case_3 where we can use synchronised
        //here both can fight for the resources
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
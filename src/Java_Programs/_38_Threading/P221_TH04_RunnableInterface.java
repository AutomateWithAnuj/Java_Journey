package Java_Programs._38_Threading;

public class P221_TH04_RunnableInterface {
    public static void main(String[] args) {
        WorkerTh04 w1 = new WorkerTh04();
        Thread t1 = new Thread(w1);
        t1.start();

        WorkerTh04 w2 = new WorkerTh04();
        Thread t2 = new Thread(w2);
        t2.start();
        //we can also set the priority for the threads
        t2.setPriority(7);

        for (int i=0;i<10;i++){
            System.out.println(i+"--"+Thread.currentThread().getName());
        }
    }
}
class WorkerTh04 implements Runnable{//we have implemented the runnable class
    //now if you will check what methods you can override from thread their are many
    //but we are interested in 2 methods those are start and run
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                System.out.println(Thread.currentThread().getName());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}



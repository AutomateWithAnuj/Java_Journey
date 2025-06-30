package Java_Programs._38_Threading.Join;

public class P234_JoinDemo {

    public static void main(String[] args) throws Exception {
        Work h1 = new Work();
        MyThread th1 = new MyThread(h1, "A");
        th1.start();
        th1.join(); // Wait for th1 to complete
        //without join they will execute together
        //it is like the concatenation it will let before threads finish it's task then it will start
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " -- " + i);
            try {
                Thread.sleep(1000); // Corrected: removed "millis:"
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

class Work {
    void show() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " -- " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    Work work;

    public MyThread(Work hello, String tname) {
        super(tname); // Set thread name
        this.work = hello;
    }

    public void run() {
        work.show();
    }
}

package Java_Programs._38_Threading.Synchronization.DeadLock;

public class P231_ThreadDeadlockSolved {

    final Resource1 a = new Resource1();
    final Resource2 b = new Resource2();

    public static void main(String[] args) {
        P231_ThreadDeadlockSolved tdSolution = new P231_ThreadDeadlockSolved();
        tdSolution.startThreads();
    }

    public void startThreads() {
        // Thread-1
        Runnable b1 = new Runnable() {
            public void run() {
                synchronized (a) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (b) {
                        System.out.println("Thread 1: In block 1");
                    }
                }
            }
        };

        // Thread-2
        Runnable b2 = new Runnable() {
            public void run() {
                synchronized (a) {
                    synchronized (b) {
                        System.out.println("Thread 2: In block 2");
                    }
                }
            }
        };

        new Thread(b1).start();
        new Thread(b2).start();
    }

    // Inner Resource1 class
    class Resource1 {
        private int i = 10;
        public int getI() { return i; }
        public void setI(int i) { this.i = i; }
    }

    // Inner Resource2 class
    class Resource2 {
        private int i = 20;
        public int getI() { return i; }
        public void setI(int i) { this.i = i; }
    }
}

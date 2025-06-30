package Java_Programs._38_Threading.Synchronization.DeadLock;

public class P230_ThreadDeadLock {
    public static void main(String[] args) {
        final String resource1 = "ATB";
        final String resource2 = "MTB";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");
                    try { Thread.sleep(100); } catch (Exception e) {}
                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }}
        };
        t1.start();
        t2.start();
        //here resource 1 is locked by the resource 2 and resource 2 is locked by resource 1
        //so here both are waiting for other so only once it will be printed
        //it will run for infinite because each one is waiting for other as noth locking other resource
        //you have to stop this program
        //so let us see next program to get rid of this situation
    }
}
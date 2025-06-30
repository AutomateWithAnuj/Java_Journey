package Java_Programs._38_Threading.Waits;

public class P232_WaitDemo {
    public static void main(String[] args) {
        WaitForMe waitForMe = new WaitForMe();

        CustomThread customThread1 = new CustomThread(waitForMe, "A");
        CustomThread customThread2 = new CustomThread(waitForMe, "B");

        customThread1.start();
        customThread2.start();
    }
}

class WaitForMe {

    // Method using `wait()`
    synchronized void show() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println("Name -> " + thread.getName() + " -> " + i);
            try {
                this.wait(1000); // waits for 1 second or until notified
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*
    // Alternative version using third-party object to wait on
    void show() {
        Thread thread = Thread.currentThread();
        ArrayList<Object> al = new ArrayList<>();

        synchronized (al) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(thread.getName() + " - show - " + i);
                try {
                    al.wait(1000); // waits on external object
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
    */
}

class CustomThread extends Thread {
    WaitForMe wait;

    public CustomThread(WaitForMe wait, String name) {
        super(name);
        this.wait = wait;
    }

    @Override
    public void run() {
        wait.show();
    }
}

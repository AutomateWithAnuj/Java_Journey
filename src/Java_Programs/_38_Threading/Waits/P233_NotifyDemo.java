package Java_Programs._38_Threading.Waits;

public class P233_NotifyDemo {
    public static void main(String[] args) {
        //here we have seen synchronization here that's why it is slow
        //if we don't use synchronization one method which will push it will pop the same thing
        //also we could get the concurrent thread exception
        //we will get the IllegalMonitorStateException because immediately what is pushed it will pop
        //we know both must be synchronized only making one is not enough
        //if we add the synchronization in the code that means we want to run them 1 by 1 and not concurrently
        Stack st = new Stack();
        B obj2 = new B(st, "B");
        A obj1 = new A(st, "A");
    }
}

class Stack {
    int x;
    boolean flag = false;

    synchronized void push(int x) {
        if (flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.x = x;
        System.out.println(x + " is pushed..");
        flag = true;
        notify();
    }

    synchronized public int pop() {
        if (!flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println(x + " is popped");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        flag = false;
        notify();
        return x;
    }
}

class A implements Runnable {
    Stack st;

    A(Stack st, String name) {
        this.st = st;
        Thread t1 = new Thread(this, name);
        t1.start();
    }

    public void run() {
        int a = 1;
        for (int i = 0; i < 10; i++) {
            st.push(a++);
        }
    }
}

class B implements Runnable {
    Stack st;

    B(Stack st, String name) {
        this.st = st;
        Thread t2 = new Thread(this, name);
        t2.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            st.pop();
        }
    }
}
package Java_Programs._38_Threading.Basics;

public class P219_TH02 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        for (int i=0;i<10;i++){
            System.out.println(t.getName() + i + " - " + t.getThreadGroup() + " - " + t.getPriority());

        }
    }
}

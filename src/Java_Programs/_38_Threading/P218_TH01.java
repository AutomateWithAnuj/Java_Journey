package Java_Programs._38_Threading;

public class P218_TH01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        //we can also do ctrl+click on the Thread class, and we will found these
            //thread is a class which implements the runnable interface
                //Runnable has only 1 abstract method which has only 1 method of run()
        //so it means thread will override the run methods
        //also there are multiple methods into the thread class
        //so here current thread method is a static method in thread class also its native means old taken from old languages
        //OS works on old languages and because of that we use native methods for thread sometimes
        System.out.println(t); //Thread[#3,main,5,main];
        //#3 is thread group name, main thread group, 5 is priority, who is the main thread
        for (int i=0;i<10;i++){
            System.out.println(i+" - "+t.getName()); //it returns the thread name whatever thread name is present
            System.out.println(i+" - "+t.getPriority()); //every thread will have some kind of priority installed with them
            t.sleep(1000L);
        }
        //so when you will print this you will get that the main thread will execute this peogram
    }
}

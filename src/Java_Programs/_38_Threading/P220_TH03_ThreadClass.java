package Java_Programs._38_Threading;

public class P220_TH03_ThreadClass {
    public static void main(String[] args) {
        //so we have to create a thread group name here which we want to have
        ThreadGroup threadGroup = new ThreadGroup("Workers");
        //Task 1 go from 1 to 5
        //these tasks are given to that WorkerTh03
        WorkerTh03 w1 = new WorkerTh03(threadGroup,"W1");
        //w1.run();//it cannot run the run method directly because it is not in thread mechanism
        //so we need to use the start method
        //also start method internally run the run method if you will check that
        w1.start();
        WorkerTh03 w2 = new WorkerTh03(threadGroup,"W2");
        w2.start();
        //Task 2 go from 1 to 100
        //this task will be given to other worker
        //so it means their are 2 threads created

        //so let us write something to run by main thread
        //main will do only this task
        for (int i=0;i<5;i++){
            try {
                System.out.println(Thread.currentThread().getName());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        //after running this you can understand various threads will do their own tasks
        //we cannot recognize which one will do which task because CPU allocates the tasks
        //so this is also called to delegate your tasks to various peoples and completing it all in end

    }
}
class WorkerTh03 extends Thread{//we have extended the thread class
    //to check which thread group they have added we can pass these arguments in constructors
    WorkerTh03(ThreadGroup tg, String name){
        //also we can call the super constructor in it
        super(tg,name);
    }
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

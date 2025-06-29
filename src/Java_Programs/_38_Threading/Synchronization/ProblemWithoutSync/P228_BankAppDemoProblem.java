package Java_Programs._38_Threading.Synchronization.ProblemWithoutSync;

class P229_BankAppDemoSolution {
    public static void main(String[] args) {
        Bank at = new Bank();
        Runnable runnable = new AccountThread(at);
        Thread th1 = new Thread(runnable,"Anuj");
        th1.start();
        Thread th2 = new Thread(runnable,"Pramod");
        th2.start();
        //-125 done -> 	Anuj
    }
}

class AccountThread implements Runnable{
    Bank bank;
    public AccountThread(Bank accService){
        this.bank = accService;
    }
    public void run(){
        for (int i=1;i<=5;i++){
            bank.withdraw(225);
            if (bank.getBalance()<0){
                System.out.println("Amount Max Out");
            }
        }
    }
}

class Bank{
    int balance = 1000; //this is not thread safe
    void withdraw(int amountTo){
        Thread th = Thread.currentThread();
        if (balance >= amountTo){
            System.out.println("Withdraw -> " + amountTo + " \t " + th.getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            balance = balance - amountTo;
            System.out.println(balance + " done -> \t" + th.getName());
        } else {
            System.out.println("Low Balance");
        }
    }
    public int getBalance(){
        return balance;
    }
}
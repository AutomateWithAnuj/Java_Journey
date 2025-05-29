package Java_Programs;

public class P073_DoWhile_AutomationRealExample {
    public static void main(String[] args) {
        //let's suppose I am working on the Web Automation
        //checking that I am able to make MySQL connection or not
        //so here in this program we can check anything which we have to do at least one time
        //like their is a file we want to close at least once after execution so in that case we can use this
        int NoOfConnections = 0;
        // let's suppose we are checking 0 to 10 elements
        do{
            System.out.println(NoOfConnections);
            //callFunction(number)
            //close the excel file, open the file
            NoOfConnections++;
        }while (NoOfConnections<0);
    }
}

package Java_Programs._35_Exceptions;

public class P172_Try_Catch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10/0;
        } /*catch (Exception e){ //larger bucket to catch and handle it
            System.out.println("Rocket Launcher for killing a cockroach");
        }*/ //we cannot use the bigger bucket first
        //we cannot use Exception before Arithmetic Exception as then Arithmetic Exception will be of no use as the Exception can catch everything
        catch (ArithmeticException e){ //smaller bucket to catch and handle it
            System.out.println("Hit Spray for killing a cockroach");
        } catch (Exception e){ //larger bucket to catch and handle it
            System.out.println("Rocket Launcher for killing a cockroach");
        }
    }
}

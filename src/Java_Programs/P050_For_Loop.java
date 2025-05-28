package Java_Programs;

public class P050_For_Loop {
    public static void main(String[] args) {
        //Help you to repeat a block of code
        //Initialization -> Condition -> Updating(Inc/Dec) -> ICU is required
        //changing order of Initialization -> Condition -> Updating cannot be done
        for (int i=1;i<=10;i++){ //++i will also give the same output here
            System.out.println(i);
        }//the movement i value become 11 it will be out of the loop
        //in case of for loop pre increment doesn't affect much
    }
}

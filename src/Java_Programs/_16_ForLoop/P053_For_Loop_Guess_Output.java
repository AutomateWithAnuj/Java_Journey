package Java_Programs._16_ForLoop;

public class P053_For_Loop_Guess_Output {
    public static void main(String[] args) {
        for (int i=0;i<18;i++){
            if(i>15){
                System.out.println("Gift from Papa, IPhone");
                //after 15 years of age papa will gift iPhones
            }
            else{
                System.out.println("No Gift");
                //this the son turns 16 papa will not give any gift to him
            }
        }
    }
}

package Java_Programs;

public class P061_For_Loop_With_Continue {
    public static void main(String[] args) {
        //continue is used to skip
        for (int i=0;i<50;i++){
            if(i==5){
                continue;
            }
            System.out.println(i); //except 5 it will print everything
            //so in case of 5 it will move out of that and execute by 6
            //System.out.println(i) will not execute for the i==5
        }
    }
}

package Java_Programs;

public class P019_PrintF {
    public static void main(String[] args) {
        int a = 10;
        //souf //used for formatting
        System.out.printf("the value of variable a is %d",a);
        // %d -> int,byte,short,long
        // %s -> String
        // %f -> float, double
        // %b -> boolean

        System.out.println();

        //let us print a table of 7 using this
        for (int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d",7,i,7*i);
            System.out.println();
        }
    }
}

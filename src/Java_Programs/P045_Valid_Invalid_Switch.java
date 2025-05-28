package Java_Programs;

public class P045_Valid_Invalid_Switch {
    public static void main(String[] args) {
        int a = 10;
        switch(a){
            //this is valid syntax
        }

        char ch = 'A';
        switch(a){
            //this is valid syntax
        }

        boolean b = true;
        /*switch(b){
            //this is not valid syntax because switch cannot take boolean
        }*/

        long all = 30l;
        switch((int) all){
            //this is a valid syntax
        }

        int i = 98;
        switch (i){
            case 98:
                System.out.println("98");
            //case 98: //duplicates cases are not allowed
                //System.out.println("98");
        }
    }
}

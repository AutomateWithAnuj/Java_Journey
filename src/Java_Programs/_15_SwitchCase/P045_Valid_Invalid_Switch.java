package Java_Programs._15_SwitchCase;

public class P045_Valid_Invalid_Switch {
    public static void main(String[] args) {
        int a = 10;
        switch(a){
            //this is valid syntax because a is int and it will go inside this block
        }

        char ch = 'A';
        switch(a){
            //this is valid syntax because a is a char and it will go inside this block
        }

        boolean b = true;
        /*switch(b){
            //this is not valid syntax because a switch cannot take a boolean
        }*/

        long all = 30l;
        switch((int) all){
            //this is a valid syntax
        }

        //is 2 duplicate cases are allowed
        int i = 98;
        switch (i){
            case 98:
                System.out.println("98");
            //case 98: //duplicates cases are not allowed
                //System.out.println("98");
        }
    }
}

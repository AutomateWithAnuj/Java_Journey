package Java_Programs;

public class P029_Type_Casting_Usage {
    public static void main(String[] args) {
        //Narrowing
        long phone_no = 9171167945l;
        //short s = phone_no; not possible
        short s = (short)phone_no;
        System.out.println(s); //-5431 based on taking only 2 Bytes to 8 Bytes

        int course_fees = 100;
        float GST = 18.45f;
        //int total = course_fees + GST; //Not possible because it is implicit narrowing
        int total = course_fees + (int)GST; //possible because it is explicit narrowing
        System.out.println(total); //0.45 is missing so we should use bigger data type
        float total2 = course_fees + GST; //Widening - Explicit not required
        System.out.println(total2);
    }
}

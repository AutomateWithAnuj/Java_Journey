package Java_Programs._33_Enum;

public class P157_ENUM_Days {
    public static void main(String[] args) {
        //by using enum
        System.out.println(Day.FRIDAY);
        //by using class
        A a = new A();
        System.out.println(a.days[6]);
    }
}
class A{
    String[] days = {"Mon", "Tue", "Web", "Thur", "Fri", "Sat", "Sun"};
    //so this above string cannot be changed they are the universal constant
    //so don't do that instead do this with enum

}
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

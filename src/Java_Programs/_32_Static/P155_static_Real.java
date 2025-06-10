package Java_Programs._32_Static;

public class P155_static_Real {
    public static void main(String[] args) {
        AutomateWithAnuj s1 = new AutomateWithAnuj();
        s1.setName("s1");
        s1.setPhone("s2");

        System.out.println(AutomateWithAnuj.courseName);
        System.out.println(AutomateWithAnuj.mentorName);

        AutomateWithAnuj.doAssignment();
    }
}
class AutomateWithAnuj{
    static {
        System.out.println("Load the class?, I will execute");
    }
    {
        System.out.println("IIB - this is called when object is created!");
        //what is the purpose
        //Here you can write code related to
        //start a website or anything before starting the validation
        //web automation or api automation
    }
    private String name; //non static
    private String phone;
    static String courseName = "atb11x"; //it is common across all of this
    static String mentorName = "Anuj";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    static void doAssignment(){
        System.out.println("Do Assignments");
    }
    void HowDoweDoAssignment(){
        System.out.println("Different how everyone do");
    }

}
package Java_Programs._26_OOPs_Encapsulation;

public class P137_Encap_Demo {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password); //he can see the password
        vwoLogin.password = "pass345"; //he can change the password
        System.out.println(vwoLogin.password); //he has changed the password also

        //as this is terrible if stranger can see the password and change
        //let us see now a good example with new class that is GoodVWOLogin
        GoodVWOLogin vwoL = new GoodVWOLogin("admin","pass123");
        //System.out.println(vwoL.password); //not able to access the password only accessible in that class only
        //so for changing the ID password we can use the getter setters and change also else no option
        vwoL.setUsername("Anuj");
        System.out.println(vwoL.getUsername());
        System.out.println(vwoL.getPassword());
        vwoL.setPassword("12345",true);//if you are admin then only you can change the password
        System.out.println(vwoL.getPassword());
    }
}
class VWOLogin{
    public String username;
    public String password;

    VWOLogin(String usr, String pwd){
        this.username = usr;
        this.password = pwd;
    }
}
class GoodVWOLogin{
    private String username; //private means they can only be access within this class
    private String password; //private means they can only be access within this class

    GoodVWOLogin(String usr, String pwd){
        this.username = usr;
        this.password = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    //we don't have to change the password by anyone only admin can do that
    public void setPassword(String password,boolean isAdmin) {
        if (isAdmin){
            this.password = password;
        } else{
            System.out.println("Not allowed");
        }
    }
}
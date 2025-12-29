package Java_Programs._26_OOPs_Encapsulation;

public class P137_Encap_Demo {
    public static void main(String[] args) {

        // Creating object of secure login class
        GoodVWOLogin vwoL = new GoodVWOLogin("admin", "pass123");

        // ❌ Direct access NOT allowed (password is private)
        // System.out.println(vwoL.password);

        // ✔ Username can be changed via setter
        vwoL.setUsername("Anuj");
        System.out.println(vwoL.getUsername());

        // ✔ Password can be read ONLY using getter
        System.out.println(vwoL.getPassword());

        // ✔ Only admin can change password
        vwoL.setPassword("12345", true);
        System.out.println(vwoL.getPassword());

        // ❌ Non-admin cannot change password
        vwoL.setPassword("hack123", false);
    }
}

// ✅ GOOD DESIGN: Data is PRIVATE
class GoodVWOLogin {

    // PRIVATE variables → data hiding
    private String username;
    private String password;

    // Constructor initializes data safely
    GoodVWOLogin(String usr, String pwd) {
        this.us

package Java_Programs._26_OOPs_Encapsulation;

class ICICIBank {

    // PRIVATE data members → Data Hiding
    private String name;
    private long bal;

    // Constructor initializes account safely
    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    // Getter → Read access for name
    public String getNameOutside() {
        return name;
    }

    // Setter → Name can be changed (optional)
    public void setNameOutside(String name) {
        this.name = name;
    }

    // Getter → Customer can VIEW balance
    public long getBalOutside() {
        return bal;
    }

    /*
     * Setter with RULE:
     * Only cashier can change balance
     */
    public void setBalByCashier(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not able to change the balance");
        }
    }
}

public class P138_Encap_Bank {

    /*
     * Encapsulation:
     * - Bundle data + methods in one class
     * - Data members should be PRIVATE
     * - Access only through controlled methods
     */

    public static void main(String[] args) {

        // Creating bank account for Anuj
        ICICIBank anuj = new ICICIBank("Anuj", 100);

        // Customer can SEE balance using getter
        System.out.println(anuj.getBalOutside());

        /*
         * Customer SHOULD NOT change balance directly
         * Only cashier is allowed
         */

        // ✔ Cashier changing balance
        anuj.setBalByCashier(500, true);

        // ❌ Non-cashier trying to change balance
        anuj.setBalByCashier(500, false);

        /*
         * We can even REMOVE setter method
         * so balance becomes read-only
         */
    }
}

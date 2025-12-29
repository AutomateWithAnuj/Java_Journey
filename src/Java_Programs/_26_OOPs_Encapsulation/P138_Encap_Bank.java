package Java_Programs._26_OOPs_Encapsulation;

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

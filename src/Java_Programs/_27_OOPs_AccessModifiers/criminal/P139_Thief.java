package Java_Programs._27_OOPs_AccessModifiers.criminal;

import Java_Programs._27_OOPs_AccessModifiers.police._140_Cop;

public class P139_Thief {
    public static void main(String[] args) {

        // Thief creating Cop object (very suspicious 😄)
        _140_Cop thief = new _140_Cop(100);

        /*
         * ❌ NOT ALLOWED:
         * canIShoot() is PROTECTED
         * Thief is:
         * - Not in same package
         * - Not a subclass
         */
        // thief.canIShoot();

        /*
         * ✔ ALLOWED:
         * gun is PUBLIC
         * Public members are accessible everywhere
         */
        System.out.println(thief.gun);

        /*
         * ❌ NOT ALLOWED:
         * iCard is DEFAULT
         * Default access → same package only
         */
        // System.out.println(thief.iCard);
    }
}

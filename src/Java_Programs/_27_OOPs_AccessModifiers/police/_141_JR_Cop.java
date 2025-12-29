package Java_Programs._27_OOPs_AccessModifiers.police;

public class _141_JR_Cop {
    public static void main(String[] args) {

        // Junior cop creating cop object
        _140_Cop jrCop = new _140_Cop(5);

        // ✔ Allowed because:
        // - Same package
        // - Method is PROTECTED
        jrCop.canIShoot();
    }
}

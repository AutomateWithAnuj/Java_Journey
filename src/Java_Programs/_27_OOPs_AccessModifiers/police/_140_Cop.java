package Java_Programs._27_OOPs_AccessModifiers.police;

public class _140_Cop {

    // PUBLIC variable → accessible everywhere
    public int gun;

    // DEFAULT variable → accessible only within same package
    String iCard;

    // Parameterized constructor
    public _140_Cop(int bullet) {
        this.gun = bullet;
    }

    /*
     * PROTECTED method
     * Accessible:
     * 1. Same package
     * 2. Subclass (even in different package)
     * NOT accessible:
     * - Normal class from another package
     */
    protected void canIShoot() {
        System.out.println("Yes you can shoot!");
    }
}

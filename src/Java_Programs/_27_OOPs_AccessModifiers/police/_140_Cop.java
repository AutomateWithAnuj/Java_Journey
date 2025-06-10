package Java_Programs._27_OOPs_AccessModifiers.police;

public class _140_Cop {
    public int gun;
    String iCard;

    //Parameterized Constructor
    public _140_Cop(int bullet){
        this.gun = bullet;
    }
    //Method //Behaviour
    protected void canIShoot(){
        System.out.println("Yes you can shoot!");
    }
}

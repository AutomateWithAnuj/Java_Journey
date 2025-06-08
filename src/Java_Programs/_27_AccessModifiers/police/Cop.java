package Java_Programs._27_AccessModifiers.police;

public class Cop {
    public int gun;
    String iCard;

    //Parameterized Constructor
    public Cop(int bullet){
        this.gun = bullet;
    }
    //Method //Behaviour
    protected void canIShoot(){
        System.out.println("Yes you can shoot!");
    }
}

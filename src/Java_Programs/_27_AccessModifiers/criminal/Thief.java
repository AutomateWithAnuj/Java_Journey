package Java_Programs._27_AccessModifiers.criminal;

import Java_Programs._27_AccessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop theif = new Cop(100);
        //theif.canIShoot(); //it shouldn't be allowed as the issue was they have made it public
        //also it will not be accessible if we make canIShoot as private
        //System.out.println(thief.gun);
    }
}

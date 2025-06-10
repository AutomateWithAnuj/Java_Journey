package Java_Programs._27_OOPs_AccessModifiers.criminal;

import Java_Programs._27_OOPs_AccessModifiers.police._140_Cop;

public class P139_Thief {
    public static void main(String[] args) {
        _140_Cop theif = new _140_Cop(100);
        //theif.canIShoot(); //it shouldn't be allowed as the issue was they have made it public
        //also it will not be accessible if we make canIShoot as private
        //System.out.println(thief.gun);
    }
}

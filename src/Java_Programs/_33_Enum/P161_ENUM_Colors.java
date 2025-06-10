package Java_Programs._33_Enum;

import java.awt.*;

public enum P161_ENUM_Colors {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;
    P161_ENUM_Colors(String hexCode){
        this.hexCode = hexCode;
    }
    String getHexCode(){
        return this.hexCode;
    }
}

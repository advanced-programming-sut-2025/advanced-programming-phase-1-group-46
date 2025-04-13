package models.buildings;

import java.util.Map;

public class Blacksmith extends Shop {
    private static Blacksmith blacksmith;
    public static Blacksmith getInstance(){
        if(blacksmith == null){
            blacksmith = new Blacksmith();
        }
        return blacksmith;
    }


}

package models.buildings;

import java.util.ArrayList;

public class CarpenterShop extends Shop{
    ArrayList<Building> buildings;
    private static CarpenterShop instance;
    public static CarpenterShop getInstance(){
        if(instance == null){
            instance = new CarpenterShop();
        }
        return instance;
    }
}

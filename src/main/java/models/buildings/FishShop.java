package models.buildings;

import models.Recipe;

import java.util.ArrayList;

public class FishShop extends Shop {
    ArrayList<Recipe> recipes;
    private static FishShop instance;
    public static FishShop getInstance() {
        if (instance == null) {
            instance = new FishShop();
        }
        return instance;
    }
}

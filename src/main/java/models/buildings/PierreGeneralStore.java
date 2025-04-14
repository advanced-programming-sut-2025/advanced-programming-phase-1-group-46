package models.buildings;


import models.Recipe;

import java.util.ArrayList;

public class PierreGeneralStore extends Shop {
    ArrayList<Recipe> recipes;
    private static PierreGeneralStore instance;
    public static PierreGeneralStore getInstance() {
        if (instance == null) {
            instance = new PierreGeneralStore();
        }
        return instance;
    }
}

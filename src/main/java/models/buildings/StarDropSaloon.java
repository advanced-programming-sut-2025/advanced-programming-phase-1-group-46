package models.buildings;

import models.Recipe;

import java.util.ArrayList;

public class StarDropSaloon extends Shop {
    ArrayList<Recipe> recipes;
    private static StarDropSaloon instance;
    public static StarDropSaloon getInstance() {
        if (instance == null) {
            instance = new StarDropSaloon();
        }
        return instance;
    }
}

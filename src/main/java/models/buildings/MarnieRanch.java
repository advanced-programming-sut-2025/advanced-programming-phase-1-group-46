package models.buildings;

import models.livingThing.Animal;

import java.util.ArrayList;

public class MarnieRanch extends Shop {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    private static MarnieRanch marnieRanch;
    public static MarnieRanch getInstance() {
        if (marnieRanch == null) {
            marnieRanch = new MarnieRanch();
        }
        return marnieRanch;
    }
}

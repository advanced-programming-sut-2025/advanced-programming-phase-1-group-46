package models.livingThing;

import models.GameObject;
import models.Result;
import models.Updatable;
import models.enums.AnimalsType;

import java.util.ArrayList;

public class Animal implements LivingThing, Updatable {
    private AnimalsType animalType;
    private int price;
    private String name;
    private ArrayList<GameObject> product;
    private int x,y;
    int foodLevel;

    @Override
    public Result interact() {
        return null;
    }

    @Override
    public void update() {

    }
}

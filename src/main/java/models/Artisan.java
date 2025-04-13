package models;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Artisan extends GameObject implements Updatable {
    int energyNeeded;
    int processingTime; //in hours
    int remainingTime;
    ArrayList<GameObject> ingredients = new ArrayList<>();
    GameObject output;

}

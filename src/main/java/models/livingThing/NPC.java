package models.livingThing;

import models.*;
import models.buildings.Building;
import models.buildings.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Predicate;

import java.util.HashMap;
import java.util.function.Predicate;

public enum NPC implements LivingThing,Updatable {
    CLINT("Clint", "Blacksmith", 100, 200, (Building) Blacksmith.getInstance(),
          generateClintDialogs(), generateClintRequests(), generateClintQuests()),

    HARVEY("Harvey", "Doctor", 150, 180, (Building) FishShop.getInstance(),
           generateHarveyDialogs(), generateHarveyRequests(), generateHarveyQuests()),

    LEAH("Leah", "Artist", 120, 220, (Building) JojoMart.getInstance(),
         generateLeahDialogs(), generateLeahRequests(), generateLeahQuests()),

    ROBIN("Robin", "Carpenter", 180, 150, (Building) CarpenterShop.getInstance(),
          generateRobinDialogs(), generateRobinRequests(), generateRobinQuests()),

    ELLIOT("Elliot", "Writer", 200, 100, (Building) PierreGeneralStore.getInstance(),
           generateElliotDialogs(), generateElliotRequests(), generateElliotQuests());

    private final String name;
    private final String job;
    private final int x, y;
    private final Building home;
    private final HashMap<DateAndTime, String> dialogs;
    private final HashMap<GameObject, GameObject> requestsAndRewards;
    private final HashMap<String, Predicate<String>> quests;

    NPC(String name, String job, int x, int y, Building home,
        HashMap<DateAndTime, String> dialogs,
        HashMap<GameObject, GameObject> requestsAndRewards,
        HashMap<String, Predicate<String>> quests) {
        this.name = name;
        this.job = job;
        this.x = x;
        this.y = y;
        this.home = home;
        this.dialogs = dialogs;
        this.requestsAndRewards = requestsAndRewards;
        this.quests = quests;
    }

    private static HashMap<DateAndTime, String> generateClintDialogs() {

    }

    private static HashMap<GameObject, GameObject> generateClintRequests() {

    }

    private static HashMap<String, Predicate<String>> generateClintQuests() {

    }

    private static HashMap<DateAndTime, String> generateHarveyDialogs() {

    }

    private static HashMap<GameObject, GameObject> generateHarveyRequests() {

    }

    private static HashMap<String, Predicate<String>> generateHarveyQuests() {

    }

    private static HashMap<DateAndTime, String> generateLeahDialogs() {

    }

    private static HashMap<GameObject, GameObject> generateLeahRequests() {

    }

    private static HashMap<String, Predicate<String>> generateLeahQuests() {

    }

    private static HashMap<DateAndTime, String> generateRobinDialogs() {

    }

    private static HashMap<GameObject, GameObject> generateRobinRequests() {

    }

    private static HashMap<String, Predicate<String>> generateRobinQuests() {

    }

    private static HashMap<DateAndTime, String> generateElliotDialogs() {

    }

    private static HashMap<GameObject, GameObject> generateElliotRequests() {

    }

    private static HashMap<String, Predicate<String>> generateElliotQuests() {

    }

    public String getName() { return name; }
    public String getJob() { return job; }
    public int getX() { return x; }
    public int getY() { return y; }
    public Building getHome() { return home; }
    public HashMap<DateAndTime, String> getDialogs() { return dialogs; }
    public HashMap<GameObject, GameObject> getRequestsAndRewards() { return requestsAndRewards; }
    public HashMap<String, Predicate<String>> getQuests() { return quests; }

    @Override
    public Result interact() {
        return null;
    }

    @Override
    public void update() {

    }
}

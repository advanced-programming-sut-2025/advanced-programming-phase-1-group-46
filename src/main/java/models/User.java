package models;

import models.enums.Farm;
import models.enums.Inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User {
    private String username;
    private String password;
    private String nickName;
    private String email;
    private boolean isMale;
    private int id;
    private int energy;
    private HashMap<Integer,String> questions;
    private boolean isLoggedIn;
    private int maxMoney;
    private int gamesPlayed;
    private Building currentBuilding;
    private Map.Entry<Integer,Integer> position;
    private Farm farm;
    private Inventory inventory;
    private int tavanaiiFarm;
    private int tavanaiiMine;
    private int tavanaiiNature;
    private int tavanaiiFishing;
    private ArrayList<Recipe> recipes;
    private HashMap<Animal,Integer> animalFriendships;


}

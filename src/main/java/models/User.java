package models;

import models.buildings.Farm;
import models.livingThing.Animal;
import models.livingThing.NPC;
import models.tools.Inventory;

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
    private ArrayList<Recipe> craftingRecipes;
    private ArrayList<Recipe> cookingRecipes;
    private HashMap<Animal,Integer> animalFriendships;
    private int money;
    private HashMap<User,Integer> friendshipWithOtherUsers;
    private HashMap<User,String> talkHistory;
    private HashMap<User,Gift> receivedGifts;
    private HashMap<User,Gift> gaveGifts;
    private boolean isAskedForMarriage;
    private HashMap<User,ArrayList<Trade>> tradesHistory;
    private HashMap<User,ArrayList<Trade>> activeTrades;
    private HashMap<NPC,Integer> npcFriendships;
    private ArrayList<String> activeQuests;
    private boolean isFeinted;
    private void checkIfFeinted() {}

    public void showTrade(){};
    public HashMap<Integer, String> getQuestions() {return questions;}

    public Map.Entry<Integer, Integer> getPosition() {return position;}

    public ArrayList<Recipe> getCraftingRecipes() {return craftingRecipes;}

    public HashMap<Animal, Integer> getAnimalFriendships() {return animalFriendships;}

    public HashMap<User, Integer> getFriendshipWithOtherUsers() {return friendshipWithOtherUsers;}

    public HashMap<User, String> getTalkHistory() {return talkHistory;}

    public HashMap<User, Gift> getReceivedGifts() {return receivedGifts;}

    public HashMap<User, Gift> getGaveGifts() {return gaveGifts;}

    public HashMap<User, Trade> getTradesHistory() {return tradesHistory;}

    public HashMap<User, Trade> getActiveTrades() {return activeTrades;}

    public HashMap<NPC, Integer> getNpcFriendships() {return npcFriendships;}

    public ArrayList<String> getActiveQuests() {return activeQuests;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getNickName() {return nickName;}

    public void setNickName(String nickName) {this.nickName = nickName;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public boolean isMale() {return isMale;}

    public void setMale(boolean male) {isMale = male;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getEnergy() {return energy;}

    public void setEnergy(int energy) {this.energy = energy;}
    public void increaseEnergy(int amount) {this.energy += amount;}

    public boolean isLoggedIn() {return isLoggedIn;}

    public void setLoggedIn(boolean loggedIn) {isLoggedIn = loggedIn;}

    public int getMaxMoney() {return maxMoney;}

    public void setMaxMoney(int maxMoney) {this.maxMoney = maxMoney;}

    public int getGamesPlayed() {return gamesPlayed;}

    public void setGamesPlayed(int gamesPlayed) {this.gamesPlayed = gamesPlayed;}

    public Building getCurrentBuilding() {return currentBuilding;}

    public void setCurrentBuilding(Building currentBuilding) {this.currentBuilding = currentBuilding;}

    public Farm getFarm() {return farm;}

    public void setFarm(Farm farm) {this.farm = farm;}

    public Inventory getInventory() {return inventory;}

    public void setInventory(Inventory inventory) {this.inventory = inventory;}

    public int getTavanaiiFarm() {return tavanaiiFarm;}

    public void setTavanaiiFarm(int tavanaiiFarm) {this.tavanaiiFarm = tavanaiiFarm;}

    public int getTavanaiiMine() {return tavanaiiMine;}

    public void setTavanaiiMine(int tavanaiiMine) {this.tavanaiiMine = tavanaiiMine;}

    public int getTavanaiiNature() {return tavanaiiNature;}

    public void setTavanaiiNature(int tavanaiiNature) {this.tavanaiiNature = tavanaiiNature;}

    public int getTavanaiiFishing() {return tavanaiiFishing;}

    public void setTavanaiiFishing(int tavanaiiFishing) {this.tavanaiiFishing = tavanaiiFishing;}

    public int getMoney() {return money;}

    public void setMoney(int money) {this.money = money;}

    public boolean isAskedForMarriage() {return isAskedForMarriage;}

    public void setAskedForMarriage(boolean askedForMarriage) {isAskedForMarriage = askedForMarriage;}
}

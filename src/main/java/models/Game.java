package models;

import models.enums.Weather;
import models.livingThing.Animal;
import models.livingThing.NPC;

import java.util.ArrayList;

public class Game {
    private ArrayList<User> players;
    private GameMap gameMap;
    private int turn; //0 to 3
    private DateAndTime dateAndTime;
    private Weather currentWeather;
    private Weather nextDayWeather;
    private ArrayList<Animal> animals;
    private ArrayList<NPC> NPCs;
    private Object[] updateByTimeObjects;
    private Object[] updateByDayObjects;
    private void handleTurns(){};
    private void thor(){
        if (currentWeather == Weather.STORMY){

        }
    }

    public ArrayList<User> getPlayers() {return players;}

    public GameMap getGameMap() {return gameMap;}

    public void setGameMap(GameMap gameMap) {this.gameMap = gameMap;}

    public int getTurn() {return turn;}

    public void setTurn(int turn) {this.turn = turn;}

    public DateAndTime getDateAndTime() {return dateAndTime;}

    public void setDateAndTime(DateAndTime dateAndTime) {this.dateAndTime = dateAndTime;}

    public Weather getCurrentWeather() {return currentWeather;}

    public void setCurrentWeather(Weather currentWeather) {this.currentWeather = currentWeather;}

    public ArrayList<Animal> getAnimals() {return animals;}

    public ArrayList<NPC> getNPCs() {return NPCs;}

}

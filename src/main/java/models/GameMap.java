package models;

import models.livingThing.NPC;

import java.util.ArrayList;
import java.util.Map;

public class GameMap {
    private ArrayList<Building> buildings;
    private final Tile[][] tiles =new Tile[100][100];
    public Tile getTile(int x, int y) {
        return tiles[y][x];
    }
    public void setTile(int x, int y, Tile tile) {
        tiles[y][x] = tile;
    }
    public Ground getGround(int x, int y) {
        return tiles[y][x].getGround();
    }
    public void setGround(int x, int y, Ground ground) {
        tiles[y][x].setGround(ground);
    }
    public GameObject getGameObject(int x, int y) {
        return tiles[y][x].getGameObject();
    }
    public void setGameObject(int x, int y, GameObject gameObject) {
        tiles[y][x].setGameObject(gameObject);
    }

}

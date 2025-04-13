package models.buildings;

import models.Tile;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.*;

public class Building {
    Map.Entry<Integer,Integer> position;
    int width=0,height=0;
    ArrayList<Tile> tiles = new ArrayList<>();

    public Entry<Integer, Integer> getPosition() {return position;}

    public void setPosition(Entry<Integer, Integer> position) {this.position = position;}

    public int getWidth() {return width;}

    public void setWidth(int width) {this.width = width;}

    public int getHeight() {return height;}

    public void setHeight(int height) {this.height = height;}

    public ArrayList<Tile> getTiles() {return tiles;}
}

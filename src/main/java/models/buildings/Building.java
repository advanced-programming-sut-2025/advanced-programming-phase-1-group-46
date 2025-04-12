package models.buildings;

import models.Tile;

import java.util.ArrayList;
import java.util.Map.*;

public interface Building {
    int x=0,y=0;
    int width=0,height=0;
    ArrayList<Tile> tiles = new ArrayList<>();

}

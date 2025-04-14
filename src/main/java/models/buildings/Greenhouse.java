package models.buildings;

import models.buildings.Building;

public class Greenhouse extends Building {
    private boolean isFixed;

    public boolean isFixed() {return isFixed;}

    public void setFixed(boolean fixed) {isFixed = fixed;}
}

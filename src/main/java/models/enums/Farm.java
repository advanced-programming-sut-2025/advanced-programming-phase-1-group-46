package models.enums;

import models.Building;
import models.buildings.Greenhouse;
import models.buildings.Home;
import models.buildings.Lake;
import models.buildings.Quarry;

import java.util.ArrayList;

public enum Farm implements Building{
    private Home home;
    private Greenhouse greenhouse;
    private ArrayList<Quarry> quarries;
    private ArrayList<Lake> lakes;

}

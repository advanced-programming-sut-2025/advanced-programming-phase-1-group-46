package Model.Enums;

import Model.Building;
import Model.Buildings.Greenhouse;
import Model.Buildings.Home;
import Model.Buildings.Lake;
import Model.Buildings.Quarry;

import java.util.ArrayList;

public enum Farm implements Building{
    private Home home;
    private Greenhouse greenhouse;
    private ArrayList<Quarry> quarries;
    private ArrayList<Lake> lakes;

}

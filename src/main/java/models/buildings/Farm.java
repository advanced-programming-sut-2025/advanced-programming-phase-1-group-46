package models.buildings;

import java.util.ArrayList;

public class Farm extends Building{
    private static Farm instance1;
    private static Farm instance2;
    private static Farm instance3;
    private static Farm instance4;

    private Home home;
    private Greenhouse greenhouse;
    private ArrayList<Quarry> quarries;
    private ArrayList<Lake> lakes;

    public static Farm getInstance1() {return instance1;}

    public static Farm getInstance2() {return instance2;}

    public static Farm getInstance3() {return instance3;}

    public static Farm getInstance4() {return instance4;}

    public Home getHome() {return home;}

    public void setHome(Home home) {this.home = home;}

    public Greenhouse getGreenhouse() {return greenhouse;}


    public ArrayList<Quarry> getQuarries() {return quarries;}

    public void setQuarries(ArrayList<Quarry> quarries) {this.quarries = quarries;}

    public ArrayList<Lake> getLakes() {return lakes;}

    public void setLakes(ArrayList<Lake> lakes) {this.lakes = lakes;}
}

package models;

public class Tile {
    private Ground ground;
    private GameObject gameObject;
    private Building building;

    public Ground getGround() {return ground;}

    public void setGround(Ground ground) {this.ground = ground;}

    public GameObject getGameObject() {return gameObject;}

    public void setGameObject(GameObject gameObject) {this.gameObject = gameObject;}

    public Building getBuilding() {return building;}

    public void setBuilding(Building building) {this.building = building;}
}

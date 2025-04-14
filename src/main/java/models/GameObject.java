package models;

public abstract class GameObject {
    abstract boolean isWalkable();
    abstract boolean isCollectable();
    int amount;
    String representation;
    String name;

}

package models.buildings;

import models.livingThing.Animal;

import java.util.ArrayList;

public class Barn extends Building {
    private ArrayList<Animal> animals;
    private int capacity;

    public ArrayList<Animal> getAnimals() {return animals;}


    public int getCapacity() {return capacity;}

    public void setCapacity(int capacity) {this.capacity = capacity;}
}

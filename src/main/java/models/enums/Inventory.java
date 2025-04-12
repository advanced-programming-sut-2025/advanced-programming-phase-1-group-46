package models.enums;

import models.GameObject;

import java.util.HashMap;

public enum Inventory {
    NORMAL(12),
    BIG(24),
    DELUXE(100000000);

    Inventory(int size) {
        this.size = size;
    }

    private int size;
    private HashMap<GameObject,Integer> daraiy;

}

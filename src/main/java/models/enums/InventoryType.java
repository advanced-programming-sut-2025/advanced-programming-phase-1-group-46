package models.enums;

import models.GameObject;

import java.util.HashMap;

public enum InventoryType {
    NORMAL(12),
    BIG(24),
    DELUXE(100000000);

    InventoryType(int size) {
        this.size = size;
    }

    private final int size;

}

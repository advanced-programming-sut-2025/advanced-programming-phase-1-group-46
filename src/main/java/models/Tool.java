package models;

import models.enums.Ground;

import java.util.Map;

public interface Tool extends GameObject {
    Result use(Map.Entry<Ground,GameObject> tile);
}

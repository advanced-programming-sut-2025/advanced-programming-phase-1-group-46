package models.tools;

import models.GameObject;
import models.Result;

public interface Tool extends GameObject {
    Result use(int direction);
    Result upgrade();
    Result getEnergy();
}

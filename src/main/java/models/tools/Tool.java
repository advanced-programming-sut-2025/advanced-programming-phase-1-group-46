package models.tools;

import models.GameObject;
import models.Result;

public abstract class Tool extends GameObject {
    private ToolLevel toolLevel;
    abstract Result use(int direction);
    abstract Result upgrade();
    abstract Result getEnergy();
}

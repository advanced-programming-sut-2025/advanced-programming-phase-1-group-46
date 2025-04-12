package models.naturalResources;

import models.enums.Season;

public class Tree implements HarvestingPlants {
    private Season season;
    private final int growTime = 7;
    private final int numberOfStages=4;
    private int Crop fruit;
}

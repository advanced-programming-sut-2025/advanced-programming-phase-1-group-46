package models.naturalResources;

import models.enums.Season;

public enum ForagingSeed implements ForagingPlants,Seed {
    JazzSeeds(Season.Spring),

    ForagingSeed(Season season) {
        this.season = season;
    }
    private Season season;
}

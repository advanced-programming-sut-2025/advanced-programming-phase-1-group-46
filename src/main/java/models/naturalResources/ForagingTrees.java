package models.naturalResources;

import models.enums.Season;

public enum ForagingTrees implements ForagingPlants{
    Acorns(Season.Special),
    ;

    ForagingTrees(Season season) {
        this.season = season;
    }

    private Season season;
}

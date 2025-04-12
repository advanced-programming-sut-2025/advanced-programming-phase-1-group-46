package models.naturalResources;

import models.enums.Season;

public enum ForagingCrops implements ForagingPlants{
    ;
    private int BaseSellPrice;
    private int energy;
    private Season season;

    ForagingCrops(int baseSellPrice, int energy, Season season) {
        BaseSellPrice = baseSellPrice;
        this.energy = energy;
        this.season = season;
    }
}

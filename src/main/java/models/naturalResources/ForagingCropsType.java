package models.naturalResources;

import models.enums.Season;

public enum ForagingCropsType {
    COMMON_MUSHROOM(40, 38, Season.SPECIAL),
    DAFFODIL(30, 0, Season.SPRING),
    DANDELION(40, 25, Season.SPRING),
    LEEK(60, 40, Season.SPRING),
    MOREL(150, 20, Season.SPRING),
    SALMONBERRY(5, 25, Season.SPRING),
    SPRING_ONION(8, 13, Season.SPRING),
    WILD_HORSERADISH(50, 13, Season.SPRING),
    FIDDLEHEAD_FERN(90, 25, Season.SUMMER),
    GRAPE(80, 38, Season.SUMMER),
    RED_MUSHROOM(75, -50, Season.SUMMER),
    SPICE_BERRY(80, 25, Season.SUMMER),
    SWEET_PEA(50, 0, Season.SUMMER),
    BLACKBERRY(25, 25, Season.FALL),
    CHANTERELLE(160, 75, Season.FALL),
    HAZELNUT(40, 38, Season.FALL),
    PURPLE_MUSHROOM(90, 30, Season.FALL),
    WILD_PLUM(80, 25, Season.FALL),
    CROCUS(60, 0, Season.WINTER),
    CRYSTAL_FRUIT(150, 63, Season.WINTER),
    HOLLY(80, -37, Season.WINTER),
    SNOW_YAM(100, 30, Season.WINTER),
    WINTER_ROOT(70, 25, Season.WINTER);

    private final int baseSellPrice;
    private final int energy;
    private final Season season;

    ForagingCropsType(int baseSellPrice, int energy, Season season) {
        this.baseSellPrice = baseSellPrice;
        this.energy = energy;
        this.season = season;
    }

    public int getBaseSellPrice() {
        return baseSellPrice;
    }

    public int getEnergy() {
        return energy;
    }

    public Season getSeason() {
        return season;
    }
}

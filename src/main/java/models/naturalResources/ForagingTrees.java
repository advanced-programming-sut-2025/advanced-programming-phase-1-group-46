package models.naturalResources;

import models.enums.Season;

public enum ForagingTrees {
    ACORNS(Season.SPECIAL),
    MAPLE_SEEDS(Season.SPECIAL),
    PINE_CONES(Season.SPECIAL),
    MAHOGANY_SEEDS(Season.SPECIAL),
    MUSHROOM_TREE_SEEDS(Season.SPECIAL);

    private final Season season;

    ForagingTrees(Season season) {
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }
}

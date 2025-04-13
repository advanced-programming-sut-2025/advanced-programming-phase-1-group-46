package models.enums;

import java.util.ArrayList;
import java.util.List;

public enum Weather {
    SUNNY(new ArrayList<>(List.of(Season.SPRING,Season.SUMMER,Season.WINTER,Season.FALL))),
    RAINY(new ArrayList<>(List.of(Season.SPRING,Season.SUMMER,Season.FALL))),
    SNOWY(new ArrayList<>(List.of(Season.SPRING,Season.SUMMER,Season.FALL))),
    STORMY(new ArrayList<>(List.of(Season.WINTER)));
    private ArrayList<Season> applicableSeasons;
    private Weather(ArrayList<Season> applicableSeasons) {
        this.applicableSeasons = applicableSeasons;
    }

}

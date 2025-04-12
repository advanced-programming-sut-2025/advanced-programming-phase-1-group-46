package models;

import models.enums.Season;

public class DateAndTime {
    private Season currentSeason;
    private int time; //9 to 22
    private int day;//1 to 28
    private enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}

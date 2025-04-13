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
    public void nextDay() {};
    public void nextMonth() {};
    public void nextSeason() {};

    public Season getCurrentSeason() {return currentSeason;}

    public void setCurrentSeason(Season currentSeason) {this.currentSeason = currentSeason;}

    public int getTime() {return time;}

    public void setTime(int time) {this.time = time;}

    public int getDay() {return day;}

    public void setDay(int day) {this.day = day;}
}

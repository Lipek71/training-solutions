package week07.d03;

import java.time.Year;

public class Date {
    private final int YEAR;
    private final int MONTH;
    private final int DAY;

    public Date(int YEAR, int MONTH, int DAY) {
        this.YEAR = YEAR;
        this.MONTH = MONTH;
        this.DAY = DAY;
    }

    public int getYEAR() {
        return YEAR;
    }

    public int getMONTH() {
        return MONTH;
    }

    public int getDAY() {
        return DAY;
    }

    public static Date of(int year, int month, int day){
        Date date = new Date(year, month, day);
        return date;
    }

    public Date withYear(int year){
        Date date = new Date(year, MONTH, DAY);
        return date;
    }
    public Date withMonth(int month){
        Date date = new Date(YEAR, month, DAY);
        return date;
    }
    public Date withDay(int day){
        Date date = new Date(YEAR, MONTH, day);
        return date;
    }

    @Override
    public String toString() {
        return getYEAR() + "-" + getMONTH() + "-" + getDAY();
    }
}

package week15.d01;

import java.util.Objects;

public class DailyExchange {
    private final int day;
    private final int rate;

    public DailyExchange(int day, int rate, int profit) {
        this.day = day;
        this.rate = rate;
   }

    public int getDay() {
        return day;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return day + ". nap rate = " + rate +
                "$";
    }
}

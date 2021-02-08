package week15.d01;

import java.util.Objects;

public class DailyExchange {
    private final int day;
    private final int rate;

    public DailyExchange(int day, int rate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DailyExchange)) return false;
        DailyExchange that = (DailyExchange) o;
        return day == that.day && rate == that.rate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, rate);
    }
}

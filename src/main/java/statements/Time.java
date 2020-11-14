package statements;

public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getInMinutes() {
        return getHour() * 60 + getMinute();
    }

    public int getInSecond() {
        return getHour() * 3600 + getMinute() * 60 + getSecond();
    }

    public boolean earlierThan(Time time) {
        return this.getInSecond() < time.getInSecond();
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

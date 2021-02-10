package exceptionclass.course;


public class SimpleTime {
    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        set(hour, minute);
    }

    private void set(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        this.hour = hour;
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.minute = minute;
    }

    public SimpleTime(String time) {
        if (time == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (time.length() != "hh:mm".length() || time.charAt(2) != ':') {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        String[] timeStart = time.split(":");
        int hourSimple;
        try {
            hourSimple = Integer.parseInt(timeStart[0]);
        } catch (
                RuntimeException re) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        int minuteSimple;
        try {
            minuteSimple = Integer.parseInt(timeStart[1]);
        } catch (
                RuntimeException re) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        set(hourSimple, minuteSimple);

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }
}

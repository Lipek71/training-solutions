package methodoverloading.pub;

import java.time.LocalTime;

public class Pub {
    private String name;
    private LocalTime openFrom;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        this.openFrom = openFrom.of(hours,minutes);
    }

    public String getName() {
        return name;
    }

    public LocalTime getOpenFrom() {
        return openFrom;
    }

    @Override
    public String toString() {
        return name + ";" + openFrom.getHour() + ":" + openFrom.getMinute();
    }

}

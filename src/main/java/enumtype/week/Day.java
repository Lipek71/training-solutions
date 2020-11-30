package enumtype.week;

public enum Day {
    MONDAY (DayType.WORKDAY),
    TUESDAY(DayType.WORKDAY),
    WEDNESDAY(DayType.WORKDAY),
    THURSDAY(DayType.WORKDAY),
    FRIDAY(DayType.WORKDAY),
    SATURDAY(DayType.HOLIDAY),
    SUNDAY(DayType.HOLIDAY);

    private final DayType dayType;

    Day(DayType dayType) {
        this.dayType = dayType;
    }
    public DayType getDayType(){
        return dayType;
    }

    public Day nextDay(Day day) {
        if (day.ordinal() == Day.values().length - 1) {
            return Day.values()[0];
        } else
            return Day.values()[day.ordinal() + 1];
    }
}

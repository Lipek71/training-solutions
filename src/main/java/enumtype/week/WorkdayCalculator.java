package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {
    private Day nextDay(Day day) {
        if (day.ordinal() == Day.values().length - 1) {
            return Day.values()[0];
        } else
            return Day.values()[day.ordinal() + 1];
    }

    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> dayTypeList = new ArrayList<>();
        Day days = firstDay;
        for(int i = 0; i < numberOfDays; i++){
            dayTypeList.add(days.getDayType());
            days = nextDay(days);
        }
        return dayTypeList;
    }
}

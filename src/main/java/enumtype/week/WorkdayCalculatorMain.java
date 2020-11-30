package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculatorMain {
    public static void main(String[] args) {
        WorkdayCalculator workdayCalculator = new WorkdayCalculator();
        System.out.println(workdayCalculator.dayTypes(Day.WEDNESDAY, 8));

        List<Day> days = new ArrayList<>();
        days.add(Day.SUNDAY);

        System.out.println(days.get(0).nextDay(days.get(0)));
    }
}

package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance1 = new Performance(LocalDate.of(2020, 12, 10), "Ateista Apostolok", LocalTime.of(22, 00), LocalTime.of(02,30));
        System.out.println(performance1.toString());
    }
}

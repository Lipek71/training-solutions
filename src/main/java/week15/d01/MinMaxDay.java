package week15.d01;

public class MinMaxDay {
    private final int minDay;
    private final int maxDay;

    public MinMaxDay(int minDay, int maxDay) {
        this.minDay = minDay;
        this.maxDay = maxDay;
    }

    @Override
    public String toString() {
        return "A(z) " + minDay + ". napon érdemes vásárolni, a(z) " + maxDay + ". napon érdemes eladni!";
    }
}

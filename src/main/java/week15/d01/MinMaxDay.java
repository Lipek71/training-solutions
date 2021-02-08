package week15.d01;

public class MinMaxDay {
    private final int minDay;
    private final int maxDay;
    private final int profit;


    public MinMaxDay(int minDay, int maxDay, int profit) {
        this.minDay = minDay;
        this.maxDay = maxDay;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "A(z) " + minDay + ". napon érdemes vásárolni, a(z) " + maxDay + ". napon érdemes eladni, a nyereség: " + profit;
    }
}

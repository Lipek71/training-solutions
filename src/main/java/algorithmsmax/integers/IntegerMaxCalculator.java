package algorithmsmax.integers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntegerMaxCalculator {
    private List<Integer> integers = new ArrayList<>();

    public void testMax() {
        for (int i = 0; i < 100; i++) {
            integers.add(i % 30);
        }
    }

    public int max(List<Integer> integers) {
        int maxInt = 0;
        for (Integer item : integers) {
            if (item > maxInt){
                maxInt = item;
            }
        }
        return maxInt;
    }
}

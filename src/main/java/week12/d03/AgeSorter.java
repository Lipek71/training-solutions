package week12.d03;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgeSorter {
    public int[] ageSorter(int[] ages) {
        int[] sortedAges = ages;
        int puffer;
        for (int i = 0; i < sortedAges.length; i++) {
            for (int j = 0; j < sortedAges.length - i - 1; j++) {
                if (sortedAges[j] > sortedAges[j + 1]) {
                    puffer = sortedAges[j + 1];
                    sortedAges[j + 1] = sortedAges[j];
                    sortedAges[j] = puffer;
                }
            }
        }
        return sortedAges;
    }

    public Map ageSorter2(int[] ages) {
        Map<Integer, Integer> lookup = new TreeMap<>();
        for (int age : ages) {
            if (!lookup.containsKey(age)) {
                lookup.put(age, 0);
            }
            lookup.put(age, lookup.get(age) + 1);
        }
        return lookup;
    }

    public int[] sortAges3(int[] ages) {
        int[] lookup = new int[130];
        for (int age : ages) {
            lookup[age]++;
        }
        int[] result = new int[ages.length];
        int idx = 0;
        for (int num = 0; num < lookup.length; num++) {
            int numCount = lookup[num];
            if (numCount > 0) {
                for (int j = 0; j < numCount; j++){
                    result[idx] = num;
                    idx++;
                }
            }
        }
        return result;
    }
}

package week12.d03;

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
}
